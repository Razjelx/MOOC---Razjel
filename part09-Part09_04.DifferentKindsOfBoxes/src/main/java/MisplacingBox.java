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

public class MisplacingBox extends Box {
    private ArrayList<Item> box;
    
    public MisplacingBox() {
        this.box = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        this.box.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
