/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package army;

import army.Droid;
import army.Battleship;
import army.Weapon;
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
public class General {
    
    private static final long serialVersionUID = 4L;
    
    @Id @GeneratedValue
    Long id;
    public String name;
    public String weaponName;
    public String shipName;
    public String armyName;
    public Battleship battleship;
    public Weapon weapon;
    public Army army;
    public Droid droid;
    public PersistentImage picture;
    public String URL;
    
    public Droid GetDroid(){
        return droid;
    }
    
      public Army GetArmy(){
        return army;
    }
      
        public Battleship GetShip(){
        return battleship;
    }
        
          public Weapon GetWeapon(){
        return weapon;
    }
    
    public String GetURL(){
        return URL;
    }
    
    public General(){
        
    }
    
    public General(String name, Battleship b, Weapon w){
        this.name = name;
        this.battleship = b;
        this.weapon = w;

    }
    
        public void setArmy(Army a){
        this.army = a;
    }
        
    public PersistentImage getPic(){
        return picture;
    }
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setBattleship(Battleship b){
        this.battleship = b;
    }
    
    public void setWeapon(Weapon w){
        this.weapon = w;     
    }
    public String toString(){
        return String.format("General Name: " + this.name);
    }
    
}
