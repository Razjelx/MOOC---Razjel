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

public class RecipeBook {
    private Recipe recipe;
    private ArrayList<Recipe> recipeBook;
    
    public RecipeBook() {
        this.recipe = recipe;
        this.recipeBook = new ArrayList<>();
    }
    
    public void addToRecipeBook(Recipe recipe) {
        this.recipeBook.add(recipe);
    }
    
    public String toString() {
        String recipes = "";
        for (Recipe recipe: this.recipeBook) {
            recipes += recipe + "\n";
        }
        return recipes;
    }
    
    public String findByName(String name) {
        String recipes = "";
        for (Recipe recipe: this.recipeBook) {
            if (recipe.getName().contains(name)){                
                recipes += recipe.getName() + ", cooking time: " + recipe.getCookingTime() + "\n";
                
            }
            
        }
        return recipes;
    }
    
    public String findByCookingTime(int maxCookingTime) {
        String recipes = "";
        for (Recipe recipe: this.recipeBook) {
            if (recipe.getCookingTime() <= maxCookingTime) {
                recipes += recipe.getName() + ", cooking time: " + recipe.getCookingTime() + "\n";
               
            }
            
        }
        return recipes;
    }
    
    public String findByIngredient(String ingredient) {
        String recipes = "";
        for (Recipe recipe: this.recipeBook) {
            if (recipe.getIngredients().contains(ingredient)) {
                
                recipes += recipe.getName() + ", cooking time: " + recipe.getCookingTime() + "\n";
                
            }
        }
        return recipes;
    }
    
    
    
}
