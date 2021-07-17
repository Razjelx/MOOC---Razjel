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
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;
    
    
    public JokeManager() {
        this.jokes = new ArrayList<>();
        
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if (this.jokes.size() == 0) {
            return "Jokes are in short supply.";
            
        }
        Random rand = new Random();
        int index = rand.nextInt(this.jokes.size());        
        return this.jokes.get(index);
    
    }
    public void printJokes() {
        System.out.println("Printing the jokes.");
        for (String joke: this.jokes) {
            System.out.println(joke);
        }
    }
}
