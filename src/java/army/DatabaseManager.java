/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package army;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.ImageIcon;

/**
 *
 * @author Pedro
 */
public class DatabaseManager {
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
                        
        EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\ECE672Proj2_PedroPena\\build\\web\\WEB-INF\\db\\army.odb");
        EntityManager em = emf.createEntityManager();
        
        if(em == null){
            System.out.println("NULL FOUND");
        }
           try{
		BufferedImage originalImage;
                ByteArrayOutputStream baos;
                byte[] imageInByte;
                /*
                originalImage = ImageIO.read(new File("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\ECE672Proj2_PedroPena\\Pictures\\obi.jpeg"));
                baos = new ByteArrayOutputStream();
                ImageIO.write( originalImage, "jpeg", baos );
                baos.flush();
                imageInByte = baos.toByteArray();
                baos.close();
                PersistentImage obiImage = new PersistentImage(imageInByte);	
                obiImage.name = "Obi Wan";
                em.getTransaction().begin();             
                em.persist(obiImage);
                em.getTransaction().commit();
                */
                originalImage = ImageIO.read(new File("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\ECE672Proj2_PedroPena\\Pictures\\obi.jpeg"));
                baos = new ByteArrayOutputStream();
                ImageIO.write( originalImage, "jpeg", baos );
                baos.flush();
                imageInByte = baos.toByteArray();
                baos.close();
                PersistentImage obiShip = new PersistentImage(imageInByte);	
                obiShip.name = "Obi Ship";
                em.getTransaction().begin();             
                em.persist(obiShip);
                em.getTransaction().commit();
                
                originalImage = ImageIO.read(new File("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\ECE672Proj2_PedroPena\\Pictures\\delta.jpeg"));
                baos = new ByteArrayOutputStream();
                ImageIO.write( originalImage, "jpeg", baos );
                baos.flush();
                imageInByte = baos.toByteArray();
                baos.close();
                PersistentImage obiSaber = new PersistentImage(imageInByte);	
                obiSaber.name = "Obi Saber";
                em.getTransaction().begin();             
                em.persist(obiSaber);
                em.getTransaction().commit();
                
                originalImage = ImageIO.read(new File("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\ECE672Proj2_PedroPena\\Pictures\\r2d2.jpeg"));
                baos = new ByteArrayOutputStream();
                ImageIO.write( originalImage, "jpeg", baos );
                baos.flush();
                imageInByte = baos.toByteArray();
                baos.close();
                PersistentImage obiDroid = new PersistentImage(imageInByte);	
                obiDroid.name = "Obi Droid";
                em.getTransaction().begin();             
                em.persist(obiDroid);
                em.getTransaction().commit();
                
                originalImage = ImageIO.read(new File("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\ECE672Proj2_PedroPena\\Pictures\\maul.jpg"));
                baos = new ByteArrayOutputStream();
                ImageIO.write( originalImage, "jpeg", baos );
                baos.flush();
                imageInByte = baos.toByteArray();
                baos.close();
                PersistentImage maulImage = new PersistentImage(imageInByte);	
                maulImage.name = "Darth Maul";
                em.getTransaction().begin();             
                em.persist(maulImage);
                em.getTransaction().commit();
                
                originalImage = ImageIO.read(new File("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\ECE672Proj2_PedroPena\\Pictures\\sithspeeder.jpeg"));
                baos = new ByteArrayOutputStream();
                ImageIO.write( originalImage, "jpeg", baos );
                baos.flush();
                imageInByte = baos.toByteArray();
                baos.close();
                PersistentImage maulShip = new PersistentImage(imageInByte);	
                maulShip.name = "Maul Ship";
                em.getTransaction().begin();             
                em.persist(maulShip);
                em.getTransaction().commit();
                
                originalImage = ImageIO.read(new File("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\ECE672Proj2_PedroPena\\Pictures\\maulsaber.jpg"));
                baos = new ByteArrayOutputStream();
                ImageIO.write( originalImage, "jpeg", baos );
                baos.flush();
                imageInByte = baos.toByteArray();
                baos.close();
                PersistentImage maulSaber = new PersistentImage(imageInByte);	
                maulSaber.name = "Maul Saber";
                em.getTransaction().begin();             
                em.persist(maulSaber);
                em.getTransaction().commit();
                
                originalImage = ImageIO.read(new File("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\ECE672Proj2_PedroPena\\Pictures\\kalani.jpeg"));
                baos = new ByteArrayOutputStream();
                ImageIO.write( originalImage, "jpeg", baos );
                baos.flush();
                imageInByte = baos.toByteArray();
                baos.close();
                PersistentImage maulDroid = new PersistentImage(imageInByte);	
                maulDroid.name = "Maul Droid";
                em.getTransaction().begin();             
                em.persist(maulDroid);
                em.getTransaction().commit();
                
                originalImage = ImageIO.read(new File("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\ECE672Proj2_PedroPena\\Pictures\\republic.png"));
                baos = new ByteArrayOutputStream();
                ImageIO.write( originalImage, "jpeg", baos );
                baos.flush();
                imageInByte = baos.toByteArray();
                baos.close();
                PersistentImage republic = new PersistentImage(imageInByte);	
                republic.name = "Republic";
                em.getTransaction().begin();             
                em.persist(republic);
                em.getTransaction().commit();
                
                originalImage = ImageIO.read(new File("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\ECE672Proj2_PedroPena\\Pictures\\seperatist.jpg"));
                baos = new ByteArrayOutputStream();
                ImageIO.write( originalImage, "jpeg", baos );
                baos.flush();
                imageInByte = baos.toByteArray();
                baos.close();
                PersistentImage seperatist = new PersistentImage(imageInByte);	
                seperatist.name = "Seperatist";
                em.getTransaction().begin();             
                em.persist(seperatist);
                em.getTransaction().commit();
                
	}catch(IOException e){
		System.out.println(e.getMessage());
	}
            /*
            Image  img = new ImageIcon("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\ECE672Proj2_PedroPena\\Pictures\\obi.jpeg").getImage();
            Image  img1 = new ImageIcon("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\ECE672Proj2_PedroPena\\Pictures\\delta.jpeg").getImage();
            Image  img2 = new ImageIcon("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\ECE672Proj2_PedroPena\\Pictures\\kalani.jpeg").getImage();
            Image  img3 = new ImageIcon("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\ECE672Proj2_PedroPena\\Pictures\\maulsaber.jpg").getImage();
            Image  img4 = new ImageIcon("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\ECE672Proj2_PedroPena\\Pictures\\obisaber.jpg").getImage();
            Image  img5 = new ImageIcon("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\ECE672Proj2_PedroPena\\Pictures\\r2d2.jpeg").getImage();
            Image  img6 = new ImageIcon("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\ECE672Proj2_PedroPena\\Pictures\\sithspeeder.jpeg").getImage();
            Image  img7 = new ImageIcon("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\ECE672Proj2_PedroPena\\Pictures\\maul.jpg").getImage();
            Image  img8 = new ImageIcon("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\ECE672Proj2_PedroPena\\Pictures\\seperatist.jpg").getImage();
            Image  img9 = new ImageIcon("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\ECE672Proj2_PedroPena\\Pictures\\republic.png").getImage();
            
            BufferedImage bufferedImage = new BufferedImage(img.getWidth(null), img.getHeight(null),
            BufferedImage.TYPE_INT_RGB);
            BufferedImage bufferedImage1 = new BufferedImage(img1.getWidth(null), img1.getHeight(null),
            BufferedImage.TYPE_INT_RGB);
            BufferedImage bufferedImage2 = new BufferedImage(img2.getWidth(null), img2.getHeight(null),
            BufferedImage.TYPE_INT_RGB);
            BufferedImage bufferedImage3 = new BufferedImage(img3.getWidth(null), img3.getHeight(null),
            BufferedImage.TYPE_INT_RGB);
            BufferedImage bufferedImage4 = new BufferedImage(img4.getWidth(null), img4.getHeight(null),
            BufferedImage.TYPE_INT_RGB);
            BufferedImage bufferedImage5 = new BufferedImage(img5.getWidth(null), img5.getHeight(null),
            BufferedImage.TYPE_INT_RGB);
            BufferedImage bufferedImage6 = new BufferedImage(img6.getWidth(null), img6.getHeight(null),
            BufferedImage.TYPE_INT_RGB);
            BufferedImage bufferedImage7 = new BufferedImage(img7.getWidth(null), img7.getHeight(null),
            BufferedImage.TYPE_INT_RGB);
            BufferedImage bufferedImage8 = new BufferedImage(img8.getWidth(null), img8.getHeight(null),
            BufferedImage.TYPE_INT_RGB);
            BufferedImage bufferedImage9 = new BufferedImage(img9.getWidth(null), img9.getHeight(null),
            BufferedImage.TYPE_INT_RGB);
              
              PersistentImage obiImage = new PersistentImage(bufferedImage);
              PersistentImage obiShip = new PersistentImage(bufferedImage1); 
              PersistentImage obiSaber = new PersistentImage(bufferedImage4);
              PersistentImage obiDroid = new PersistentImage(bufferedImage5);
              PersistentImage maulImage = new PersistentImage(bufferedImage7);
              PersistentImage maulShip = new PersistentImage(bufferedImage6);
              PersistentImage maulSaber = new PersistentImage(bufferedImage3);
              PersistentImage maulDroid = new PersistentImage(bufferedImage2);
              PersistentImage repubic = new PersistentImage(bufferedImage9);
              PersistentImage seperatist = new PersistentImage(bufferedImage8);
              
              em.getTransaction().begin();             
              em.persist(obiImage);
              em.persist(obiShip);
              em.persist(obiSaber);
              em.persist(obiDroid);
              em.persist(maulImage);
              em.persist(maulShip);
              em.persist(maulSaber);
              em.persist(maulDroid);
              em.persist(repubic);
              em.persist(seperatist);
              em.getTransaction().commit();
        */
        /*
        File file = new File("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\ECE672Proj2_PedroPena\\Pictures\\obi.jpeg");
 
        FileInputStream fis = new FileInputStream(file);
        //create FileInputStream which obtains input bytes from a file in a file system
        //FileInputStream is meant for reading streams of raw bytes such as image data. For reading streams of characters, consider using FileReader.
 
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];

            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                //Writes to this byte array output stream
                bos.write(buf, 0, readNum); 
                System.out.println("read " + readNum + " bytes,");
            }

 
        byte[] bytes = bos.toByteArray();
                */
    }
    
}
