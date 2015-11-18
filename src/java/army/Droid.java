/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package army;

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
public class Droid {
    
    private static final long serialVersionUID = 9L;    
    
    @Id @GeneratedValue
    Long id;
    public String name;
    public String model;
        public PersistentImage picture;
            public String URL;
    
    public String GetURL(){
        return URL;
    }
    
    public Droid(){
        
    }
        public Droid(String name, String model){
        this.name = name;
        this.model = model;
    }
     public void setName(String name){
        this.name = name;
    }
     
       public void setModel(String model){
        this.model = model;
    }
    
    public String toString(){
        return "Droid Name: "  + name + " Model: " + model;
    }
    
}
