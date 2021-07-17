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
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    private int totalWeight;
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
        this.totalWeight = totalWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight + suitcase.totalWeight() <= this.maxWeight) {
            this.suitcases.add(suitcase);
            this.totalWeight += suitcase.totalWeight();
        }
    }
    public String toString() {
        if (this.suitcases.isEmpty()) {
            return null;
        }
        String output = this.suitcases.size() + " suitcases (" + this.totalWeight + " kg)";
        
        
        String items = "";
        
        for (Suitcase suitcase: this.suitcases) {
            items += suitcase + "\n";
        }
        return output + items;
    }

    public void printItems() {
        for (Suitcase suitcase: this.suitcases) {
            System.out.println(suitcase);
        }
    }
    
}
