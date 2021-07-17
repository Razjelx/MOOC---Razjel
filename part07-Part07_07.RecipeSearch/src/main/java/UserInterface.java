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
import java.util.Scanner;
import java.io.File;
import java.nio.file.Paths;
        
public class UserInterface {
    private Recipe recipe;
    private Scanner scanner;
    private RecipeBook recipeBook;
    
    
    public UserInterface(Scanner scanner) {
        this.recipe = recipe;
        this.scanner = scanner;
        this.recipeBook = recipeBook;
    }

    public void start() {
        System.out.println("File to read:");
        String file = scanner.nextLine();
        readObjectFromFile(file);
        System.out.print("\n" + "Commands:\n" + "list - lists the recipes\n" + "stop - stops the program\n" + "find name - searches recipes by name\n" + "find cooking time - searches recipes by cooking time\n" + "find ingredient - searches recipes by ingredients\n");
       
        while (true) {
            System.out.println("\n" + "Enter command:");
            String command = scanner.nextLine();
            if (command.equals("list")) {
                System.out.print("\n" + "Recipes:\n" + this.recipeBook);
            } else if (command.equals("stop")) {
                break;
            } else if (command.equals("find name")) {
                System.out.println("Searched word:");
                String name = scanner.nextLine();
                System.out.println("\n" + "Recipes:\n" + this.recipeBook.findByName(name));
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());
                System.out.println("\n" + "Recipes:\n" + this.recipeBook.findByCookingTime(maxCookingTime));
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String ingredient = scanner.nextLine();
                System.out.println("\n" + "Recipes:\n" + this.recipeBook.findByIngredient(ingredient));
                
            }
            
        }    
    }
    public void readObjectFromFile(String file) {
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            int i = 0;
            String name = "";
            
            
            int cookingTime = 0;
            this.recipeBook = new RecipeBook();
            while (true) {
                if (!(scanner.hasNextLine())) {
        
                   
                    this.recipeBook.addToRecipeBook(recipe);
                    
                    break;
                }                
                String line = scanner.nextLine();           
                
                if (!(line.isEmpty())) {
                    
                    if (i == 0) {
                        
                        name = line;
                        
                    } else if (i == 1) {
                       
                        cookingTime = Integer.valueOf(line);
                        this.recipe = new Recipe(name, cookingTime);
                    } else {
                        
                        this.recipe.addIngredients(line);
                        
                    }    
                    
                } else {
                   
                    
                    
                    
                    this.recipeBook.addToRecipeBook(recipe);      
                    i = 0;
                    name = "";
                   
                    cookingTime = 0;
                    continue;
                }
       
                i++;
               
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
           
        }
        
    }
 
    
    
}
