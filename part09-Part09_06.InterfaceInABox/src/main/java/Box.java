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

public class Box implements Packable {
    private double capacity;
    private ArrayList<Packable> box;

    public Box(double capacity) {
        this.capacity = capacity;
        this.box = new ArrayList<>();
    }
    public void add(Packable packable) {
        if (weight() + packable.weight() <= this.capacity) {
            this.box.add(packable);
        }
    } 
    @Override
    public double weight() {
        double totalWeight = 0;
        for (Packable packable: this.box) {
            totalWeight += packable.weight();
        }
        return totalWeight;
    }
    @Override
    public String toString() {
        return "Box: " + this.box.size() + " items, total weight " + weight() + " kg";
    }
}
