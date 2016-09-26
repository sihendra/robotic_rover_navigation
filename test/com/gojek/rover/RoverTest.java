package com.gojek.rover;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hendra.s@go-jek.com on 9/26/16.
 */
public class RoverTest {
    @Test
    public void move1() throws Exception {
        Rover r = new Rover();
        r.setPosition(new RoverPosition(1, 2, CompassPoint.NORTH));

        // LMLMLMLMM
        r.move(RoverMovement.L);
        r.move(RoverMovement.M);
        r.move(RoverMovement.L);
        r.move(RoverMovement.M);
        r.move(RoverMovement.L);
        r.move(RoverMovement.M);
        r.move(RoverMovement.L);
        r.move(RoverMovement.M);
        r.move(RoverMovement.M);

        RoverPosition finalPosition = r.getPosition();

        assertEquals(1, finalPosition.getX());
        assertEquals(3, finalPosition.getY());
        assertEquals(CompassPoint.NORTH, finalPosition.getDirection());

    }

    @Test
    public void move2() throws Exception {
        Rover r = new Rover();
        r.setPosition(new RoverPosition(3, 3, CompassPoint.EAST));

        // LMLMLMLMM
        r.move(RoverMovement.M);
        r.move(RoverMovement.M);
        r.move(RoverMovement.R);
        r.move(RoverMovement.M);
        r.move(RoverMovement.M);
        r.move(RoverMovement.R);
        r.move(RoverMovement.M);
        r.move(RoverMovement.R);
        r.move(RoverMovement.R);
        r.move(RoverMovement.M);

        RoverPosition finalPosition = r.getPosition();

        assertEquals(5, finalPosition.getX());
        assertEquals(1, finalPosition.getY());
        assertEquals(CompassPoint.EAST, finalPosition.getDirection());

    }

}