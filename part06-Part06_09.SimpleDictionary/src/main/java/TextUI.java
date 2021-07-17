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
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary translations;
    
    public TextUI(Scanner scanner, SimpleDictionary translations) {
        this.scanner = scanner;
        this.translations = translations;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("search")) {
                System.out.println("To be translated:");
                String toTranslate = scanner.nextLine();
                String translation = "";
                translation = this.translations.translate(toTranslate);
                
                if (!(translation == null)) {
                    System.out.println("Translation: " + translation);
                } else {
                    System.out.println("Word " + toTranslate + " was not found");
                    
                }    
                    
                
                
            
            
            } else if (command.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                this.translations.add(word, translation);
                
            
            
            } else {
                System.out.println("Unknown command");
            }   
                
            
        }
    }


}
