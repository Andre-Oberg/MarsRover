/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ax.ha.it.marsrover;

import ax.ha.it.marsrover.Movement.validDirections;

/**
 *
 * @author André
 */
public class Movement {
    
    private int x = 0;
    
    private int y = 0;
    
    private String direction; 

    int[][] map = new int[5][5];
    
    public Movement(int x, int y, String direction) {
        if ((x > 0 && x < 6) && (y > 0 && y < 6)) {
            this.x = x;
            this.y = y;
        } else {
            System.out.println("Invalid starting position");
        }
        
        switch(direction) {
            case "N":
                this.direction = direction;
                break;
            case "S":
                this.direction = direction;
                break;
            case "E":
                this.direction = direction;
                break;
            case "W":
                this.direction = direction;
                break;
            default:
                System.out.println("Invalid direction");
        }
        
    }
    
    
    public void readInput () {
        switch(direction) {
            case "F":
                this.direction = direction;
                break;
            case "B":
                this.direction = direction;
                break;
            case "L":
                this.direction = direction;
                break;
            case "R":
                this.direction = direction;
                break;
            default:
                System.out.println("Invalid direction");
        }

    }
    
    public void initialPosition(int xPos, int yPos, char dir) {
        
    }
 
    public int moveForward() {
        return 0;
    }
           
    public int moveBackward() {
        return 0;
    }
    
    public int turnLeft() {
        return 0;
    }
    
    public int turnRight() {
        return 0;
    }
    
    public boolean validatePosition() {
        return true;
    }
    
}
