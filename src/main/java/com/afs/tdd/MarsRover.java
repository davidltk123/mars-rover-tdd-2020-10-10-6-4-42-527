package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {
    private int locationX;
    private int locationY;
    private String direction;

    public MarsRover(int locationX, int locationY, String direction){
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public void executeCommands(String commands) {
        //Arrays.asList(commands.split("")).forEach(command -> this.executeCommand(command));
    }

    private void executeCommand(String command) {
        if(command.equals("M")){
            this.move();
        }
    }

    private void move() {
    }

    public int getLocationX() {
        return 0;
    }

    public int getLocationY() {
        return 0;
    }

    public String getDirection() {
        return null;
    }
}
