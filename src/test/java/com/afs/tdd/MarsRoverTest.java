package com.afs.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    private static final String NORTH = "N";
    private static final String SOUTH = "S";
    private static final String EAST = "E";
    private static final String WEST = "W";

    @Test
    public void should_return_y_plus_1_when_executeCommands_given_0_0_N_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        MarsRoverController controller = new MarsRoverController();
        //when
        controller.executeCommands(marsRover,"M");
        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(1,marsRover.getLocationY());
        assertEquals(NORTH,marsRover.getDirection());
    }

    @Test
    public void should_return_y_minus_1_when_executeCommands_given_0_0_S_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"S");
        MarsRoverController controller = new MarsRoverController();
        //when
        controller.executeCommands(marsRover,"M");
        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(-1,marsRover.getLocationY());
        assertEquals(SOUTH,marsRover.getDirection());
    }

    @Test
    public void should_return_x_plus_1_when_executeCommands_given_0_0_E_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"E");
        MarsRoverController controller = new MarsRoverController();
        //when
        controller.executeCommands(marsRover,"M");
        //then
        assertEquals(1,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals(EAST,marsRover.getDirection());
    }

    @Test
    public void should_return_x_minus_1_when_executeCommands_given_0_0_W_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"W");
        MarsRoverController controller = new MarsRoverController();
        //when
        controller.executeCommands(marsRover,"M");
        //then
        assertEquals(-1,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals(WEST,marsRover.getDirection());
    }

    @Test
    public void should_return_W_when_executeCommands_given_0_0_N_and_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        MarsRoverController controller = new MarsRoverController();
        //when
        controller.executeCommands(marsRover,"L");
        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals(WEST,marsRover.getDirection());
    }

    @Test
    public void should_return_E_when_executeCommands_given_0_0_S_and_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"S");
        MarsRoverController controller = new MarsRoverController();
        //when
        controller.executeCommands(marsRover,"L");
        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals(EAST,marsRover.getDirection());
    }

    @Test
    public void should_return_N_when_executeCommands_given_0_0_E_and_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"E");
        MarsRoverController controller = new MarsRoverController();
        //when
        controller.executeCommands(marsRover,"L");
        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals(NORTH,marsRover.getDirection());
    }

    @Test
    public void should_return_S_when_executeCommands_given_0_0_W_and_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"W");
        MarsRoverController controller = new MarsRoverController();
        //when
        controller.executeCommands(marsRover,"L");
        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals(SOUTH,marsRover.getDirection());
    }

    @Test
    public void should_return_E_when_executeCommands_given_0_0_N_and_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        MarsRoverController controller = new MarsRoverController();
        //when
        controller.executeCommands(marsRover,"R");
        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals(EAST,marsRover.getDirection());
    }

    @Test
    public void should_return_W_when_executeCommands_given_0_0_S_and_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"S");
        MarsRoverController controller = new MarsRoverController();
        //when
        controller.executeCommands(marsRover,"R");
        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals(WEST,marsRover.getDirection());
    }

    @Test
    public void should_return_S_when_executeCommands_given_0_0_E_and_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"E");
        MarsRoverController controller = new MarsRoverController();
        //when
        controller.executeCommands(marsRover,"R");
        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals(SOUTH,marsRover.getDirection());
    }

    @Test
    public void should_return_N_when_executeCommands_given_0_0_W_and_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"W");
        MarsRoverController controller = new MarsRoverController();
        //when
        controller.executeCommands(marsRover,"R");
        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals(NORTH,marsRover.getDirection());
    }

    @Test
    public void should_return_negative_1_1_N_when_executeCommands_given_0_0_N_and_MLMR() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        MarsRoverController controller = new MarsRoverController();
        //when
        controller.executeCommands(marsRover,"MLMR");
        //then
        assertEquals(-1,marsRover.getLocationX());
        assertEquals(1,marsRover.getLocationY());
        assertEquals(NORTH,marsRover.getDirection());
    }

}
