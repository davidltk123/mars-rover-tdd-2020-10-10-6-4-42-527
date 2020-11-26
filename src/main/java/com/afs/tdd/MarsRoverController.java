package com.afs.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MarsRoverController {
    //private List<Command> commandList = new ArrayList<>();

    public void executeCommands(MarsRover marsRover, String commands){
        Arrays.asList(commands.split("")).forEach(command -> this.executeCommand(marsRover, command));
    }

    private void executeCommand(MarsRover marsRover, String command) {
        switch(command){
            case "M" :
                //this.commandList.add(new MoveCommand(marsRover));
                new MoveCommand(marsRover).execute();
                break;
            case "L" :
                //this.commandList.add(new TurnLeftCommand(marsRover));
                new TurnLeftCommand(marsRover).execute();
                break;
            case "R" :
                //this.commandList.add(new TurnRightCommand(marsRover));
                new TurnRightCommand(marsRover).execute();
                break;
        }
    }
}
