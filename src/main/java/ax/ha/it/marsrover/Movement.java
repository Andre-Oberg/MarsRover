/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ax.ha.it.marsrover;


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
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public String getDirection() {
        return this.direction;
    }
    
    public void readInput (String input) {
        switch(input) {
            case "F":
                moveForward();
                break;
            case "B":
                moveBackward();
                break;
            case "L":
                turnLeft();
                break;
            case "R":
                turnRight();
                break;
            default:
                System.out.println("Invalid direction");
        }

    }
    
    public void initialPosition(int xPos, int yPos, char dir) {
        
    }
 
    public void horizontalOrVertical() {
        if (direction == "N" || direction == "S") {
        
        } else if (direction == "W" || direction == "E") {
        
        }
    }
    
    public void moveForward() {
        switch(this.direction) {
            case "N":
                this.y -= 1;
                break;
            case "S":
                this.y += 1;
                break;
            case "E":
                this.x += 1;
                break;
            case "W":
                this.x -= 1;
                break;
            default:
                System.out.println("Something went wrong");
        }
    }
           
    public void moveBackward() {
        switch(this.direction) {
            case "N":
                this.y += 1;
                break;
            case "S":
                this.y -= 1;
                break;
            case "E":
                this.x -= 1;
                break;
            case "W":
                this.x += 1;
                break;
            default:
                System.out.println("Something went wrong");
        }
    }
    
    public void turnLeft() {
        switch(this.direction) {
            case "N":
                this.direction = "W";
                break;
            case "S":
                this.direction = "E";
                break;
            case "E":
                this.direction = "N";
                break;
            case "W":
                this.direction = "S";
                break;
            default:
                System.out.println("Invalid direction");
        }
    }
    
    public void turnRight() {
        switch(this.direction) {
            case "N":
                this.direction = "E";
                break;
            case "S":
                this.direction = "W";
                break;
            case "E":
                this.direction = "S";
                break;
            case "W":
                this.direction = "N";
                break;
            default:
                System.out.println("Invalid direction");
        }
    }
    
    public boolean validatePosition() {
        return true;
    }
    
}
