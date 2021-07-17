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

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int cookingTime) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
        
    }

    public String getName() {
        return this.name;
    }
    
    public int getCookingTime() {
        return this.cookingTime;
    }
    
    public void addIngredients(String ingredient) {
        this.ingredients.add(ingredient);
    }
    
    public ArrayList<String> getIngredients() {               
        return this.ingredients;
    }
    
    public String toString() {
       
        String ingredients = "";
        for (String ingredient: this.ingredients) {
            ingredients += ingredient + "\n";
        }
        
        
        
        String output = this.name + ", cooking time: " + this.cookingTime;
        return output;
    }
    
      
    
}
