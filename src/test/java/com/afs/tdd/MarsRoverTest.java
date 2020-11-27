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
        Controller controller = new Controller(marsRover);
        LocationInfo expectedLocationInfo = new LocationInfo(0,1,"N");
        //when
        controller.receiveCommands("M");
        controller.executeCommands();
        //then
        assertEquals(expectedLocationInfo,marsRover.getLocationInfo());
    }

    @Test
    public void should_return_y_minus_1_when_executeCommands_given_0_0_S_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"S");
        Controller controller = new Controller(marsRover);
        LocationInfo expectedLocationInfo = new LocationInfo(0,-1,"S");
        //when
        controller.receiveCommands("M");
        controller.executeCommands();
        //then
        assertEquals(expectedLocationInfo,marsRover.getLocationInfo());
    }

    @Test
    public void should_return_x_plus_1_when_executeCommands_given_0_0_E_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"E");
        Controller controller = new Controller(marsRover);
        LocationInfo expectedLocationInfo = new LocationInfo(1,0,"E");
        //when
        controller.receiveCommands("M");
        controller.executeCommands();
        //then
        assertEquals(expectedLocationInfo,marsRover.getLocationInfo());
    }

    @Test
    public void should_return_x_minus_1_when_executeCommands_given_0_0_W_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"W");
        Controller controller = new Controller(marsRover);
        LocationInfo expectedLocationInfo = new LocationInfo(-1,0,"W");
        //when
        controller.receiveCommands("M");
        controller.executeCommands();
        //then
        assertEquals(expectedLocationInfo,marsRover.getLocationInfo());
    }

    @Test
    public void should_return_W_when_executeCommands_given_0_0_N_and_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        Controller controller = new Controller(marsRover);
        LocationInfo expectedLocationInfo = new LocationInfo(0,0,"W");
        //when
        controller.receiveCommands("L");
        controller.executeCommands();
        //then
        assertEquals(expectedLocationInfo,marsRover.getLocationInfo());
    }

    @Test
    public void should_return_E_when_executeCommands_given_0_0_S_and_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"S");
        Controller controller = new Controller(marsRover);
        LocationInfo expectedLocationInfo = new LocationInfo(0,0,"E");
        //when
        controller.receiveCommands("L");
        controller.executeCommands();
        //then
        assertEquals(expectedLocationInfo,marsRover.getLocationInfo());
    }

    @Test
    public void should_return_N_when_executeCommands_given_0_0_E_and_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"E");
        Controller controller = new Controller(marsRover);
        LocationInfo expectedLocationInfo = new LocationInfo(0,0,"N");
        //when
        controller.receiveCommands("L");
        controller.executeCommands();
        //then
        assertEquals(expectedLocationInfo,marsRover.getLocationInfo());
    }

    @Test
    public void should_return_S_when_executeCommands_given_0_0_W_and_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"W");
        Controller controller = new Controller(marsRover);
        LocationInfo expectedLocationInfo = new LocationInfo(0,0,"S");
        //when
        controller.receiveCommands("L");
        controller.executeCommands();
        //then
        assertEquals(expectedLocationInfo,marsRover.getLocationInfo());
    }

    @Test
    public void should_return_E_when_executeCommands_given_0_0_N_and_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        Controller controller = new Controller(marsRover);
        LocationInfo expectedLocationInfo = new LocationInfo(0,0,"E");
        //when
        controller.receiveCommands("R");
        controller.executeCommands();
        //then
        assertEquals(expectedLocationInfo,marsRover.getLocationInfo());
    }

    @Test
    public void should_return_W_when_executeCommands_given_0_0_S_and_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"S");
        Controller controller = new Controller(marsRover);
        LocationInfo expectedLocationInfo = new LocationInfo(0,0,"W");
        //when
        controller.receiveCommands("R");
        controller.executeCommands();
        //then
        assertEquals(expectedLocationInfo,marsRover.getLocationInfo());
    }

    @Test
    public void should_return_S_when_executeCommands_given_0_0_E_and_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"E");
        Controller controller = new Controller(marsRover);
        LocationInfo expectedLocationInfo = new LocationInfo(0,0,"S");
        //when
        controller.receiveCommands("R");
        controller.executeCommands();
        //then
        assertEquals(expectedLocationInfo,marsRover.getLocationInfo());
    }

    @Test
    public void should_return_N_when_executeCommands_given_0_0_W_and_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"W");
        Controller controller = new Controller(marsRover);
        LocationInfo expectedLocationInfo = new LocationInfo(0,0,"N");
        //when
        controller.receiveCommands("R");
        controller.executeCommands();
        //then
        assertEquals(expectedLocationInfo,marsRover.getLocationInfo());
    }

    @Test
    public void should_return_negative_1_1_N_when_executeCommands_given_0_0_N_and_MLMR() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        Controller controller = new Controller(marsRover);
        LocationInfo expectedLocationInfo = new LocationInfo(-1,1,"N");
        //when
        controller.receiveCommands("MLMR");
        controller.executeCommands();
        //then
        assertEquals(expectedLocationInfo,marsRover.getLocationInfo());
    }

}
