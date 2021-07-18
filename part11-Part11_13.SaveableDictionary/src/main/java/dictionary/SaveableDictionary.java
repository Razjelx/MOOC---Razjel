/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author Razjel
 */
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.io.FileWriter;

public class SaveableDictionary {
    private HashMap<String, String> dictionary;
    private String fileName;
    
    
    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.fileName = file;
        
    }
    
    public boolean load() {                
        try (Scanner scanner = new Scanner(Paths.get(this.fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                this.add(parts[0], parts[1]);
                
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    
    public boolean save() {
        try (FileWriter file = new FileWriter(this.fileName)) {
            for (String key: this.dictionary.keySet()) {
                String value = this.dictionary.get(key);
                System.out.println(key + ":" + value);
                file.write(key + ":" + value + "\n");
                
            }
            file.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        
        return true;
    }
    
    public void add(String words, String translation) {
        this.dictionary.putIfAbsent(words, translation);
    }

    public String translate(String word) {
        for (String key: this.dictionary.keySet()) {
            if (key.equals(word)) {
                return this.dictionary.get(key);
            } else if (this.dictionary.get(key).equals(word)) {
                return key;
            }
        }
        
        return null;
    }

    public void delete(String word) {
        Iterator<String> it = this.dictionary.keySet().iterator();
        while (it.hasNext()) {
            if (it.next().equals(word)) {
                it.remove();
            }
        }
        Iterator<String> iti = this.dictionary.values().iterator();
        while (iti.hasNext()) {
            if (iti.next().equals(word)) {
                iti.remove();
            }
        }
    }
}
