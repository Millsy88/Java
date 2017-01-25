/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombiestarter;

/**
 *
 * @author a9-mills
 */
public class Room {
    
    private String desc;
    private String items;
    private String entrances;
    private String zombies;
    
    
    Room (String desc){
        this.desc= desc;
        
    }

    public String getDescription() {
        return desc;
    }
    
    public String getEntrances(){
        return items;
    }
            
    public String getItems(){
        return entrances;
    }
    
    public String getZombieCount(){
        return zombies;
    }
    
}
