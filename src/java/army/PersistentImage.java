/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package army;

import com.sun.org.apache.xml.internal.security.utils.Base64;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.persistence.Entity;
import sun.awt.image.codec.JPEGImageDecoderImpl;
import sun.awt.image.codec.JPEGImageEncoderImpl;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Pedro
 */
@Entity
public class PersistentImage
{
    @Id @GeneratedValue
    Long id;
    private static final long serialVersionUID = 4L;
    public String name;
    public byte[] data;
    
    public byte[] getData(){
        
        return data;
    }
    
    public String getBase64(){
        return Base64.encode(data);
    }
     public PersistentImage(byte[] bArray)
    {
        data = bArray;
    }
    public PersistentImage(BufferedImage image) throws IOException
    {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        new JPEGImageEncoderImpl(out).encode(image);
        data = out.toByteArray();        
    }
 
    public Image makeImage() throws IOException
    {
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        return new JPEGImageDecoderImpl(in).decodeAsBufferedImage();
    }
}