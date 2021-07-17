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
public class Suitcase {
    private ArrayList<Item> listOfItems;
    private int maxWeight;
    private int totalWeight;
    
    public Suitcase(int maxWeight) {
        this.listOfItems = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.totalWeight = totalWeight;
    }
    
    public void addItem(Item item) {
        
        if (this.totalWeight + item.getWeight() <= this.maxWeight) {
            this.listOfItems.add(item);
            this.totalWeight += item.getWeight();
        }    
        
           
        
        
    }    
    public String toString() {
        String printOutput1 = this.listOfItems.size() + " item (" + this.totalWeight + " kg)";
        String printOutput2 = this.listOfItems.size() + " items (" + this.totalWeight + " kg)";
        
        if (this.listOfItems.isEmpty()) {
            return "no items (" + this.totalWeight + " kg)";
        }
        String items = "";
        if (this.listOfItems.size() == 1) {
            for (Item item: this.listOfItems) {
            items += item;
            }    
            return printOutput1 + items;   
        } else {
            for (Item item: this.listOfItems) {
                 items += item;
            }
            return printOutput2 += items + "\n";
        }
    }    
    
    public void printItems() {
        for (Item items: this.listOfItems) {
            System.out.println(items);
        }       
    }    
    
    public int totalWeight() {
        return this.totalWeight;
    }

    public Item heaviestItem() {
                
        if (this.listOfItems.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.listOfItems.get(0);
        for (Item items: this.listOfItems) {
            if (heaviest.getWeight() < items.getWeight()) {
                heaviest = items;
            }
        }
        return heaviest;
    }

}
