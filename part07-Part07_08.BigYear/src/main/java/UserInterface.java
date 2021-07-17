/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Razjel
 */
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    private Bird bird;
    private Scanner scanner;
    private ArrayList<Bird> birds;
    
    public UserInterface(Scanner scanner) {
        this.bird = bird;
        this.scanner = scanner;
        this.birds = new ArrayList<>();
    }

    public void start() {
        while (true) {
            System.out.println("?");
            String input = scanner.nextLine();
            
            if (input.equals("Add")) {
                System.out.println("Name:");
                String name = scanner.nextLine();
                System.out.println("Name in Latin:");
                String latinName = scanner.nextLine();
                Bird bird = new Bird(name, latinName);
                this.birds.add(bird);
            
            } else if (input.equals("Observation")) {
                System.out.println("Bird?");
                String name = scanner.nextLine();
                findObjectByName(name);
                if(findObjectByName(name) == null) {
                    System.out.println("Not a bird!");
                } else {
                    findObjectByName(name).addObservation();
                }
                
            } else if (input.equals("All")) {
                printAll();
            } else if (input.equals("One")) {
                System.out.println("Bird?");
                String name = scanner.nextLine();                
                System.out.println(findObjectByName(name));
            } else if (input.equals("Quit")) {
                break;
            }
        }
        
    }
    
    public Bird findObjectByName(String name) {
        
        for (Bird bird: this.birds) {
            if (bird.getName().equals(name)) {
                return bird;
            }
        }
        return null;
    }
    
    public void printAll() {        
        for (Bird bird: this.birds) {
            System.out.println(bird.getName() + "(" + bird.getLatinName() + "): " + bird.getObservations() + " observations");
        }
        
    }
}
