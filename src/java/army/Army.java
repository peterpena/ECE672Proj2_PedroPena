/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package army;

import java.io.Serializable;
import java.sql.Date;
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
public class Army implements Serializable{
    private static final long serialVersionUID = 2L;
    
    @Id @GeneratedValue
    Long id;
    private String name;
    private List<Battleship> battleships;
    private List<Droid> droids;
    public List<General> generals;
    public PersistentImage picture; 
        public String URL;
    
    public String GetURL(){
        return URL;
    }
    public Army(String name){
        this.name = name;   
        battleships = new LinkedList<Battleship>();
        droids = new LinkedList<Droid>();
        generals = new LinkedList<General>();
    }
    
    public void AddShip(Battleship b){
        battleships.add(b);
    }
    
    public void AddDroid(Droid d){
        droids.add(d);
    }
    
    public void AddGeneral(General g){
        generals.add(g);
    }
    
        public void DeleteShip(Battleship b){
        if(battleships.contains(b))
            battleships.remove(b);
    }
    
    public void DeleteDroid(Droid d){
        if(droids.contains(d))
            droids.remove(d);
    }
    
    public void DeleteGeneral(General g){
        if(generals.contains(g))
           generals.remove(g);
    }
       
    public void setName(String name){
        this.name = name;
    }
    
        public String getName(){
        return this.name;
    }
                public PersistentImage getPic(){
        return this.picture;
    }
    public String toString(){
        return String.format("Army Name: " + this.name);
    }
    
}
