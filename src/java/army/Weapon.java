/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package army;

import army.General;
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
public class Weapon {
    private static final long serialVersionUID = 5L;
    
    @Id @GeneratedValue
    Long id;
    public String name;
    public General general;
    public PersistentImage picture;    
        public String URL;
    
    public String GetURL(){
        return URL;
    }
    public Weapon(){
        
    }
    
    public Weapon(String name, General g){
        this.general = g;
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
     public void setName(String name){
        this.name = name;
    }
     
    public void setGeneral(General g){
         this.general = g;
     }
    
    public String toString(){
        return "Weapon Name: " + name + "Used By: " + general.getName();
    }
}
