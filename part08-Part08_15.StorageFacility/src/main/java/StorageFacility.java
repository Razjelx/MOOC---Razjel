/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Razjel
 */
import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility() {
        this.storage = new HashMap<>();
        
    }
    
    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());
        ArrayList<String> items = this.storage.get(unit);
        items.add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (this.storage.get(storageUnit) == null) {
            return new ArrayList<>();
        }
        return this.storage.get(storageUnit);
    }

    public void remove(String storageUnit, String item) {
     
        if (this.storage.get(storageUnit).size() == 0) {
            this.storage.remove(storageUnit);
        }
        this.storage.get(storageUnit).remove(item);
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for (String unit: this.storage.keySet()) {
            if (this.storage.get(unit).size() != 0) { 
                units.add(unit);
            }
        }
        return units;
    }
}