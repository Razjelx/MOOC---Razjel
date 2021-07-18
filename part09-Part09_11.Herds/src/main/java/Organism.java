/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Razjel
 */
public class Organism implements Movable {
    private int positionX;
    private int positionY;
    
    public Organism(int x, int y) {
        this.positionX = x;
        this.positionY = y;
    }

    public void move(int dx, int dy) {
        this.positionX += dx;
        this.positionY += dy;
    }
    
    public String toString() {
        return "x: " + this.positionX + "; y: " + this.positionY;
    }
}
