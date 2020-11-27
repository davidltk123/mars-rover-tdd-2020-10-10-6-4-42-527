package com.afs.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {
    private static final String MOVE = "M";
    private static final String TURNLEFT = "L";
    private static final String TURNRIGHT = "R";
    private MarsRover marsRover;
    private List<Command> commandList = new ArrayList<>();

    public Controller(MarsRover marsRover){
        this.marsRover = marsRover;
    }

    public void receiveCommands(String commands){
        Arrays.asList(commands.split("")).forEach(command -> {
            switch(command){
                case MOVE:
                    this.commandList.add(new MoveCommand(this.marsRover));
                    break;
                case TURNLEFT:
                    this.commandList.add(new TurnLeftCommand(this.marsRover));
                    break;
                case TURNRIGHT:
                    this.commandList.add(new TurnRightCommand(this.marsRover));
                    break;
            }
        });
    }

    public void executeCommands() {
        commandList.forEach(Command::execute);
    }
}
