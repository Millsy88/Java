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
public class World {
    
    private String info;
    private String look;
    private String inventory;
    private String start;
    private Room room;
    
    World (String info, String inventory, String start){
        this.info = info;
        //this.look = look;
        this.inventory = inventory;
        this.start = start;
        //this.room = room;
    }

    public String getInfo() {
        return info;
    }
    
    public String getDescription(){
        return look;
    } 
    
    public String getInventoryHtml(){
        return inventory;
    }
    
    public String getStartHtml(){
        return start;
    }
    
}
