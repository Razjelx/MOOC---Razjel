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
    private Scanner scanner;
    private ArrayList<Integer> pointList;
    private Grades grades;
    private int passingPoints;
    
    
    public UserInterface(Scanner scanner, ArrayList<Integer> pointList, Grades grades) {
        this.scanner = scanner;
        this.pointList = new ArrayList<Integer>();
        this.passingPoints = passingPoints;
        this.grades = grades;
    }   

    
    
 
    public void start() {
        
        System.out.println("Enter point toitals, -1 stops:");
        while (true) {
            int points = Integer.valueOf(scanner.nextLine());
            if (points == -1) {
                break;
            }
        
            if (points >= 0 && points <= 100) {
                this.pointList.add(points);
                this.grades.addGradeBasedOnPoints(points);
            }
        }
        System.out.println("Point average (all): " + average());
        if (passingAverage() == -1) {
            System.out.println("Point average (passing): -"); 
        } else {
            System.out.println("Point average (passing): " + passingAverage());
        }
        System.out.println(this.passingPoints);
        System.out.println(this.pointList.size());
        System.out.println("Pass percentage: " + (100 * (1.0 * this.passingPoints / this.pointList.size())));
        System.out.println("Grade distribution:");
        printGradeDistribution();
    }

    public double average() {
        int sum = 0;
        double avg = 0;
        
        for (Integer point: this.pointList) {
            sum += point;
        }
        avg = 1.0 * sum / this.pointList.size();
        return avg;
    }
    
    public double passingAverage() {
        int sum = 0;
        int totalPass = 0;
        double avg = 0;
        
        for (Integer point: this.pointList) {
            if (point >= 50) {
                sum += point;
                totalPass ++;
            }
            
        }
        this.passingPoints = totalPass;
        if (sum == 0) {
            return -1;
        }
        avg = 1.0 * sum / totalPass;
        return avg;
    }

    public void gradeDistribution() {
        for (Integer point: this.pointList) {
            if (point < 50) {
                System.out.println("0:");
            }
        }
    }
    
    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = this.grades.numberOfGrades(grade);
            System.out.print(grade + ": ");
            while (stars > 0) {
                System.out.print("*");
                stars--;
            }
            System.out.println("");
            grade--;
        }
    }

    
}
