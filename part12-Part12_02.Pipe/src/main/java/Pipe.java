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

public class Pipe<T> {
    private ArrayList<T> values;
    
    public Pipe() {
        this.values = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.values.add(value);
    }
    
    public T takeFromPipe() {
        if (this.values.isEmpty()) {
            return null;
        }
        T value = this.values.get(0);
        this.values.remove(this.values.get(0));
        return value;
        
    }

    public boolean isInPipe() {
        if (!this.values.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
