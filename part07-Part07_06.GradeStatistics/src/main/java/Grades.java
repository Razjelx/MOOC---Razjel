


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

public class Grades {  
    private ArrayList<Integer> grades;
    
    public Grades() {
        this.grades = new ArrayList<>();
                
    }
    
    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrades(points));
        
    }
    public static int pointsToGrades(int points) {
        int grade = 0;
        
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        return grade;
    }
    
    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received: this.grades) {
            if (received == grade) {
                count ++;
            }
        }
        return count;
    }
}


