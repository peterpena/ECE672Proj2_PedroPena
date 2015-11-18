/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package army;
import army.Battleship;
import army.Droid;
import army.General;
import army.PersistentImage;
import army.Weapon;
import org.apache.commons.io.IOUtils;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
 
@MultipartConfig(maxFileSize = 16177215)
public class EditGeneralServlet extends HttpServlet {
     
    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doPost(
        HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("ENTERED CLASS.......");
        // gets values of text fields
            String genName = request.getParameter("generalName");
            String name   = request.getParameter("name");
            String army   = request.getParameter("army");
            String droidName  = request.getParameter("droid");
            String droidModel = request.getParameter("model");
            String ship   = request.getParameter("ship");
            String weapon = request.getParameter("weapon");
        
         
        InputStream inputStream = null; // input stream of the upload file
         
        // obtains the upload file part in this multipart request
        Part filePart = request.getPart("photo");
        if (filePart != null) {
            // prints out some information for debugging
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());
             
            // obtains input stream of the upload file
            inputStream = filePart.getInputStream();
        }
         
                // Obtain a database connection:
        EntityManagerFactory emf =
           (EntityManagerFactory)getServletContext().getAttribute("emf");
        EntityManager em = emf.createEntityManager();
        String message = null;  // message will be sent back to client
         
        try {
 
List<Army> ArmyList = em.createQuery(
                "SELECT a FROM Army a", Army.class).getResultList();
            request.setAttribute("armies", ArmyList);
            General editGeneral = null;
            
                    for(General g: ArmyList.get(0).generals)
                    {
                        if(g.name.equals(genName))
                        {
                            editGeneral = g;
                        }
                    }
                    for(General g: ArmyList.get(1).generals)
                    {
                        if(g.name.equals(genName))
                        {
                            editGeneral = g;
                        }
                    }
            System.out.println(" :) GOT THE IMAGE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("Name: " + name);
            if (name != null || army != null || droidName != null || ship != null ||
                weapon != null || droidModel != null || inputStream != null) {
                 
                
                if(!name.equals("") && editGeneral != null)
                {
                   editGeneral.name = name;
                }
                
                if(!army.equals("") && editGeneral != null)
                {
                    for(Army a: ArmyList){
                        if(a.getName().equals(army))
                            editGeneral.army = a;
                } 
                } 
                 if(!droidName.equals("") && editGeneral != null)
                {
                   editGeneral.droid.name = droidName;
                } 
                 if(!droidModel.equals("") && editGeneral != null)
                {
                   editGeneral.droid.model = droidModel;
                }  
               if(!ship.equals("") && editGeneral != null)
                {
                   editGeneral.battleship.name = ship;
                } 
               
                if(inputStream != null && editGeneral != null)
                {
                    System.out.println("CHANGING PICTURE FOR " + editGeneral.name + "....................");
                    List<PersistentImage> ImageList = em.createQuery(
                    "SELECT a FROM PersistentImage a", PersistentImage.class).getResultList();
                    request.setAttribute("images", ImageList);    
                    for(PersistentImage image : ImageList)
                    {
                        if(image.name.equals(editGeneral.name))
                        {
                            System.out.println("FOUND AN IMAGE........................");
                            byte[] imageInByte;  
                            imageInByte = IOUtils.toByteArray(inputStream);
                            image.data = imageInByte;
                        }
                    }
                }              
                System.out.println("PROCESSING IMAGE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                
                em.getTransaction().begin();
                em.persist(editGeneral);
                em.getTransaction().commit();
            }

        }finally {
            // Close the database connection:
            if (em.getTransaction().isActive())
                em.getTransaction().rollback();
            em.close();
            }
        
        getServletContext().getRequestDispatcher("/army.jsp").forward(request, response);
    }
    
        @Override
    protected void doGet(
        HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}