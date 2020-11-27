package com.afs.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    private static final String NORTH = "N";
    private static final String SOUTH = "S";
    private static final String EAST = "E";
    private static final String WEST = "W";
    private static final String MOVE = "M";
    private static final String TURNLEFT = "L";
    private static final String TURNRIGHT = "R";

    @Test
    public void should_return_y_plus_1_when_executeCommands_given_0_0_N_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,NORTH);
        Controller controller = new Controller(marsRover);
        //when
        controller.receiveCommands(MOVE);
        controller.executeCommands();
        LocationInfo expectedLocationInfo = new LocationInfo(0,1,NORTH);
        //then
        assertEquals(expectedLocationInfo,marsRover.getLocationInfo());
    }

    @Test
    public void should_return_y_minus_1_when_executeCommands_given_0_0_S_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,SOUTH);
        Controller controller = new Controller(marsRover);
        //when
        controller.receiveCommands(MOVE);
        controller.executeCommands();
        LocationInfo expectedLocationInfo = new LocationInfo(0,-1,SOUTH);
        //then
        assertEquals(expectedLocationInfo,marsRover.getLocationInfo());
    }

    @Test
    public void should_return_x_plus_1_when_executeCommands_given_0_0_E_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,EAST);
        Controller controller = new Controller(marsRover);
        //when
        controller.receiveCommands(MOVE);
        controller.executeCommands();
        LocationInfo expectedLocationInfo = new LocationInfo(1,0,EAST);
        //then
        assertEquals(expectedLocationInfo,marsRover.getLocationInfo());
    }

    @Test
    public void should_return_x_minus_1_when_executeCommands_given_0_0_W_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,WEST);
        Controller controller = new Controller(marsRover);
        //when
        controller.receiveCommands(MOVE);
        controller.executeCommands();
        LocationInfo expectedLocationInfo = new LocationInfo(-1,0,WEST);
        //then
        assertEquals(expectedLocationInfo,marsRover.getLocationInfo());
    }

    @Test
    public void should_return_W_when_executeCommands_given_0_0_N_and_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,NORTH);
        Controller controller = new Controller(marsRover);
        //when
        controller.receiveCommands(TURNLEFT);
        controller.executeCommands();
        LocationInfo expectedLocationInfo = new LocationInfo(0,0,WEST);
        //then
        assertEquals(expectedLocationInfo,marsRover.getLocationInfo());
    }

    @Test
    public void should_return_E_when_executeCommands_given_0_0_S_and_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,SOUTH);
        Controller controller = new Controller(marsRover);
        //when
        controller.receiveCommands(TURNLEFT);
        controller.executeCommands();
        LocationInfo expectedLocationInfo = new LocationInfo(0,0,EAST);
        //then
        assertEquals(expectedLocationInfo,marsRover.getLocationInfo());
    }

    @Test
    public void should_return_N_when_executeCommands_given_0_0_E_and_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,EAST);
        Controller controller = new Controller(marsRover);
        //when
        controller.receiveCommands(TURNLEFT);
        controller.executeCommands();
        LocationInfo expectedLocationInfo = new LocationInfo(0,0,NORTH);
        //then
        assertEquals(expectedLocationInfo,marsRover.getLocationInfo());
    }

    @Test
    public void should_return_S_when_executeCommands_given_0_0_W_and_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,WEST);
        Controller controller = new Controller(marsRover);
        //when
        controller.receiveCommands(TURNLEFT);
        controller.executeCommands();
        LocationInfo expectedLocationInfo = new LocationInfo(0,0,SOUTH);
        //then
        assertEquals(expectedLocationInfo,marsRover.getLocationInfo());
    }

    @Test
    public void should_return_E_when_executeCommands_given_0_0_N_and_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,NORTH);
        Controller controller = new Controller(marsRover);
        //when
        controller.receiveCommands(TURNRIGHT);
        controller.executeCommands();
        LocationInfo expectedLocationInfo = new LocationInfo(0,0,EAST);
        //then
        assertEquals(expectedLocationInfo,marsRover.getLocationInfo());
    }

    @Test
    public void should_return_W_when_executeCommands_given_0_0_S_and_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,SOUTH);
        Controller controller = new Controller(marsRover);
        //when
        controller.receiveCommands(TURNRIGHT);
        controller.executeCommands();
        LocationInfo expectedLocationInfo = new LocationInfo(0,0,WEST);
        //then
        assertEquals(expectedLocationInfo,marsRover.getLocationInfo());
    }

    @Test
    public void should_return_S_when_executeCommands_given_0_0_E_and_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,EAST);
        Controller controller = new Controller(marsRover);
        //when
        controller.receiveCommands(TURNRIGHT);
        controller.executeCommands();
        LocationInfo expectedLocationInfo = new LocationInfo(0,0,SOUTH);
        //then
        assertEquals(expectedLocationInfo,marsRover.getLocationInfo());
    }

    @Test
    public void should_return_N_when_executeCommands_given_0_0_W_and_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,WEST);
        Controller controller = new Controller(marsRover);
        //when
        controller.receiveCommands(TURNRIGHT);
        controller.executeCommands();
        LocationInfo expectedLocationInfo = new LocationInfo(0,0,NORTH);
        //then
        assertEquals(expectedLocationInfo,marsRover.getLocationInfo());
    }

    @Test
    public void should_return_negative_1_1_N_when_executeCommands_given_0_0_N_and_MLMR() {
        //given
        MarsRover marsRover = new MarsRover(0,0,NORTH);
        Controller controller = new Controller(marsRover);
        String command = MOVE+TURNLEFT+MOVE+TURNRIGHT;
        //when
        controller.receiveCommands(command);
        controller.executeCommands();
        LocationInfo expectedLocationInfo = new LocationInfo(-1,1,NORTH);
        //then
        assertEquals(expectedLocationInfo,marsRover.getLocationInfo());
    }

}
