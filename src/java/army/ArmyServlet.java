/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package army;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.persistence.*;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
 
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.swing.ImageIcon;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author Pedro
 */
public class ArmyServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
 
    @Override
    protected void doGet(
        HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        // Obtain a database connection:
        EntityManagerFactory emf =
           (EntityManagerFactory)getServletContext().getAttribute("emf");
        EntityManager em = emf.createEntityManager();
 
        try {
             /*General jedi = new General();
              jedi.setName("Obi Wan Kenobi");
              Weapon GreenLightSaber = new Weapon("Green Light Saber", jedi);
              jedi.setWeapon(GreenLightSaber);
              Droid droid = new Droid("R2D2", "Astromech");
              Battleship jediShip = new Battleship("Delta-7 Jedi StarFighter", jedi);
              jedi.setBattleship(jediShip);
              Army army = new Army("Galactic Republic");
              army.AddDroid(droid);
              army.AddGeneral(jedi);
              army.AddShip(jediShip);
              em.getTransaction().begin();
              em.persist(army);
              em.persist(jedi);
              em.persist(GreenLightSaber);
              em.persist(jediShip);
              em.persist(droid);
              em.getTransaction().commit();
              General sith = new General();
              sith.setName("Darth Maul");
              Weapon RedLightSaber = new Weapon("Red Light Saber", sith);
              sith.setWeapon(RedLightSaber);
              Droid Sithdroid = new Droid("General Kalani", "Strategy Droid");
              Battleship sithSpeeder = new Battleship("Sith Speeder", sith);
              sith.setBattleship(sithSpeeder);
              Army alliance = new Army("Seperatist Alliance");
              alliance.AddDroid(Sithdroid);
              alliance.AddGeneral(sith);
              alliance.AddShip(sithSpeeder);
              em.getTransaction().begin();
              em.persist(alliance);
              em.persist(sith);
              em.persist(RedLightSaber);
              em.persist(sithSpeeder);
              em.persist(Sithdroid);
              em.getTransaction().commit();
            
              Image  img = new ImageIcon("obi.jpg").getImage();
            
              BufferedImage bufferedImage = new BufferedImage(img.getWidth(null), img.getHeight(null),
              BufferedImage.TYPE_INT_RGB);
              
              PersistentImage obiImage = new PersistentImage(bufferedImage);
        
            General general = em.find(General.class, 1);
 
            em.getTransaction().begin();
            general.picture = obiImage;
            em.getTransaction().commit();
            
            // Handle a new army (if any):
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
          */  
            // Display the list of Armies:
            List<Army> ArmyList = em.createQuery(
                "SELECT a FROM Army a", Army.class).getResultList();
            request.setAttribute("armies", ArmyList);
            request.getRequestDispatcher("/army.jsp")
                .forward(request, response);
           /* 
            System.out.println("Name: " + name);
            if (name != null || army != null || droidName != null || ship != null ||
                weapon != null || inputStream != null || droidModel != null) {
                
                General jedi = new General();
                jedi.setName(name);
                for(Army a: ArmyList){
                    if(a.getName().equals(army))
                        jedi.army = a;
                }             
                Weapon saber = new Weapon(weapon, jedi);
                jedi.setWeapon(saber);
                Droid droid = new Droid(droidName, droidModel);
                jedi.droid = droid;
                
                byte[] imageInByte;  
                
                imageInByte = IOUtils.toByteArray(inputStream);
                PersistentImage persImage = new PersistentImage(imageInByte);	
                persImage.name = jedi.name;
                Battleship Aship = new Battleship(ship, jedi);
                jedi.setBattleship(Aship);
                em.getTransaction().begin();
                em.persist(jedi);
                em.persist(saber);
                em.persist(droid);
                em.persist(Aship);
                em.persist(persImage);
                em.getTransaction().commit();
            }
 */
        } finally {
            // Close the database connection:
            if (em.getTransaction().isActive())
                em.getTransaction().rollback();
            em.close();
        }
    }
 
    @Override
    protected void doPost(
        HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
