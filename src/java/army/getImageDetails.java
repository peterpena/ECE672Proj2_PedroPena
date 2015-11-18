/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package army;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Pedro
 */
public class getImageDetails extends HttpServlet {

    private static final long serialVersionUID = 1L;
 
    @Override
    protected void doGet(
        HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        // Obtain a database connection:
        EntityManagerFactory emf =
           (EntityManagerFactory)getServletContext().getAttribute("emf");
        EntityManager em = emf.createEntityManager();
        String img_id = request.getParameter("your_id");
        OutputStream oImage;
 
        try {
                List<PersistentImage> ImageList = em.createQuery(
                "SELECT a FROM PersistentImage a", PersistentImage.class).getResultList();
            request.setAttribute("images", ImageList);
            
             for(PersistentImage image: ImageList){
                 if(image.name.equals(img_id)){
                     byte barray[] = image.getData();
                     response.setContentType("image/jpeg");
                     oImage=response.getOutputStream();
                     oImage.write(barray);
                     oImage.flush();
                     oImage.close();
                 }
             }
 
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
