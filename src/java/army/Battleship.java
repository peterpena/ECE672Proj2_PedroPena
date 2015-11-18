package army;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import army.Droid;
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
public class Battleship {
    
    private static final long serialVersionUID = 3L;
    
    @Id @GeneratedValue
    Long id;
    public String name;
    public General general;
        public PersistentImage picture;
            public String URL;
    
    public String GetURL(){
        return URL;
    }
    
    public Battleship(){
        
    }
    
    public Battleship(String name, General g){
        this.name = name;
        this.general = g;
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
        return String.format("Battleship Name: " + this.name);
    }
}
