/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Razjel
 */
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> box;
    
    public BoxWithMaxWeight(int capacity) {
        this.box = new ArrayList<>();
        this.capacity = capacity;
        
    }
    
    @Override
    public void add(Item item) {
        if (this.capacity - item.getWeight() >= 0) {
            this.box.add(item);
            this.capacity -= item.getWeight();
        }
        
    } 
    
    @Override
    public boolean isInBox(Item item) {
        if (this.box.contains(item)) {
            return true;
            
            
        }
        return false;
    }
    
    public ArrayList<Item> printList() {
        return this.box;
    }
}
