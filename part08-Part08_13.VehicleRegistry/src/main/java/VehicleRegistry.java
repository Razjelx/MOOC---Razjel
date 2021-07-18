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

public class VehicleRegistry {
    private HashMap<LicensePlate, String> hashmap;
    
    public VehicleRegistry() {
        this.hashmap = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!hashmap.containsKey(licensePlate)) {
            hashmap.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate) {
        if (this.hashmap.containsKey(licensePlate)) {
            return this.hashmap.get(licensePlate);
        }
        return null;
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.hashmap.containsKey(licensePlate)) {
            this.hashmap.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for(LicensePlate licensePlate: this.hashmap.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
     
        for (String owner: this.hashmap.values()) {
            if (!owners.contains(owner)) {
                owners.add(owner);
                System.out.println(owner);
            } else {
                continue;
            }
                                
            
        }    
        
    }
    
}
