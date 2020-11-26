package com.afs.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {
    private static final String MOVE = "M";
    private static final String TURNLEFT = "L";
    private static final String TURNRIGHT = "R";
    //private List<Command> commandList = new ArrayList<>();

    public void executeCommands(MarsRover marsRover, String commands){
        Arrays.asList(commands.split("")).forEach(command -> this.executeCommand(marsRover, command));
    }

    private void executeCommand(MarsRover marsRover, String command) {
        switch(command){
            case MOVE:
                //this.commandList.add(new MoveCommand(marsRover));
                new MoveCommand(marsRover).execute();
                break;
            case TURNLEFT:
                //this.commandList.add(new TurnLeftCommand(marsRover));
                new TurnLeftCommand(marsRover).execute();
                break;
            case TURNRIGHT:
                //this.commandList.add(new TurnRightCommand(marsRover));
                new TurnRightCommand(marsRover).execute();
                break;
        }
    }
}
