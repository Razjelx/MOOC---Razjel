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

public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        this.history = new ArrayList<Double>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }
    
    public double maxValue() {
        double maxValue = this.history.get(0);
        if (this.history.isEmpty()) {
            return 0.0;
        }
        for (double change: this.history) {
            if (change > maxValue) {
                maxValue = change;
            }
        }
        return maxValue;
    }
    
    public double minValue() {
        double minValue = this.history.get(0);
        if (this.history.isEmpty()) {
            return 0.0;
        }
        for (double change: this.history) {
            if (change < minValue) {
                minValue = change;
            }
        }
        return minValue;
    }
    
    public double average() {
        double sum = 0.0;
        if (this.history.isEmpty()) {
            return 0.0;
        }
        for (double change: this.history) {
            sum += change;
        }
        return sum / this.history.size();
    }
    
    public String toString() {
        return this.history.toString();
    }
}
