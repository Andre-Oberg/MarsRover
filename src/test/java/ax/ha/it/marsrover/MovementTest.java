/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ax.ha.it.marsrover;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author André
 */
public class MovementTest {
    
    public MovementTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    /*@BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }*/

    @org.junit.jupiter.api.Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    public void testValidinItialPosition() {
        
        Movement move = new Movement(2, 2, "W");
        
        Movement move1 = new Movement(1, 1, "N");
        
        Movement move2 = new Movement(0, 1, "S");
        
        Movement move3 = new Movement(5, 5, "E");
        
        //assertEquals(22, move.add("22"));
    }
    
    public void testInvalidInitialPosition() {
         Movement move4 = new Movement(6, 5, "W");
         Movement move2 = new Movement(0, 1, "W");
    }
    
    public void testInvalidStartingDirection() {
         Movement move4 = new Movement(1, 1, "We");
         Movement move2 = new Movement(0, 1, "Invalid");
    }
    
    public void testTurningLeftWhenFacingNorth() {
        Movement rover = new Movement(3, 3, "N");
        rover.turnLeft();
        assertEquals("W", rover.getDirection());
    }
    
    public void testTurningRightWhenFacingEast() {
        Movement rover = new Movement(3, 3, "E");
        rover.turnRight();
        assertEquals("S", rover.getDirection());
    }
    
    public void testMovingForwardWhenFacingSouth() {
        Movement rover = new Movement(3, 3, "S");
        rover.readInput("F");
        assertEquals("2", rover.getY());
    }
    
    public void testMovingBackwardsWhenFacingEast() {
        Movement rover = new Movement(5, 3, "E");
        rover.readInput("B");
        assertEquals("4", rover.getX());
    }
    
    public void testTurningLeftThenMoveForwardWhenFacingEast() {

        Movement rover = new Movement(3, 3, "E");

        rover.readInput("L");

        rover.readInput("F");

        assertEquals("2", rover.getY());
        
    }
    
    public void testMovingBackAndForthWhenFacingWest() {
        Movement rover = new Movement(4, 5, "W");
        rover.readInput("F");
        rover.readInput("B");
        assertEquals("4", rover.getX());
    }
    
    public void testMovingToLeftAtLeftEdge() {
    
    }
    
    public void testMovingToRightAtRightEdge() {
    
    }
    
    public void testMovingDownAtSouthernEdge() {
    
    }
    
    public void testMovingUpAtNorthernEdge() {
    
    }
}
