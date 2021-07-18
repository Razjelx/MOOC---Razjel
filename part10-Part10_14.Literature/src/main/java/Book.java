/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Razjel
 */
public class Book {
    private String name;
    private int recommendedYear;
    
    public Book(String name, int year) {
        this.name = name;
        this.recommendedYear = year;
    }

    public String getName() {
        return this.name;
    }

    public int getRecommendedYear() {
        return this.recommendedYear;
    }

    public String toString() {
        return this.name + " (recommended for " + this.recommendedYear + " year-olds or older)"; 
    }
}
