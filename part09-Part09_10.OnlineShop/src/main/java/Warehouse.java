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
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class Warehouse {   
    private Map<String, Integer> stock;
    private Map<String, Integer> products; 

    public Warehouse() {
        this.stock = new HashMap<>();
        this.products = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.products.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        for (String key: this.products.keySet()) {
            if (key.equals(product)) {
                return this.products.get(key);
            }
        }
        return -99;
    }
    
    public int stock(String product) {
        for(String key: this.stock.keySet()) {
            if (key.equals(product)) {
                return this.stock.get(key);
            }
        }
        return 0;    
    }

    public boolean take(String product) {
       
        for (String key: this.stock.keySet()) {
            if (key.equals(product)) {
               if (this.stock.get(key) > 0) {
                   this.stock.replace(key, this.stock.get(key)-1);
                   return true;
               } 
            }
        }
        return false;
    }
    
    public Set<String> products() {
        Set<String> products = new HashSet<>();
        for (String key: this.products.keySet()) {
            products.add(key);
        }
        return products;
    }
    
  
    
    
     
    
    

    

    
}
