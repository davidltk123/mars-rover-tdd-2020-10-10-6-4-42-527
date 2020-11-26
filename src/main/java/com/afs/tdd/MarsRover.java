package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {
    private int locationX;
    private int locationY;
    private String direction;

    public MarsRover(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public void executeCommands(String commands) {
        Arrays.asList(commands.split("")).forEach(command -> this.executeCommand(command));
    }

    private void executeCommand(String command) {
        switch(command){
            case "M" :
                this.move();
                break;
            case "L" :
                this.turnLeft();
                break;
            case "R" :
                this.turnRight();
                break;
        }
    }

    private void turnLeft() {
        switch(this.direction){
            case "N" :
                this.direction = "W";
                break;
            case "S" :
                this.direction = "E";
                break;
            case "W" :
                this.direction = "S";
                break;
            case "E" :
                this.direction = "N";
                break;
        }
    }

    private void turnRight() {
        switch(this.direction){
            case "N" :
                this.direction = "E";
                break;
            case "S" :
                this.direction = "W";
                break;
            case "W" :
                this.direction = "N";
                break;
            case "E" :
                this.direction = "S";
                break;
        }
    }

    private void move() {
        switch(this.direction){
            case "N" :
                this.locationY++;
                break;
            case "S" :
                this.locationY--;
                break;
            case "W" :
                this.locationX--;
                break;
            case "E" :
                this.locationX++;
                break;
        }
    }

    public int getLocationX() {
        return this.locationX;
    }

    public int getLocationY() {
        return this.locationY;
    }

    public String getDirection() {
        return this.direction;
    }
}
