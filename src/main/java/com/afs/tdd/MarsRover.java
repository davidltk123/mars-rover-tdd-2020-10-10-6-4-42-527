package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {
    private static final String NORTH = "N";
    private static final String WEST = "W";
    private static final String SOUTH = "S";
    private static final String EAST = "E";
    private int locationX;
    private int locationY;
    private String direction;

    public MarsRover(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public void turnLeft() {
        switch(this.direction){
            case NORTH:
                this.direction = WEST;
                break;
            case SOUTH:
                this.direction = EAST;
                break;
            case WEST:
                this.direction = SOUTH;
                break;
            case EAST:
                this.direction = NORTH;
                break;
        }
    }

    public void turnRight() {
        switch(this.direction){
            case NORTH :
                this.direction = EAST;
                break;
            case SOUTH :
                this.direction = WEST;
                break;
            case WEST :
                this.direction = NORTH;
                break;
            case EAST :
                this.direction = SOUTH;
                break;
        }
    }

    public void move() {
        switch(this.direction){
            case NORTH :
                this.locationY++;
                break;
            case SOUTH :
                this.locationY--;
                break;
            case WEST :
                this.locationX--;
                break;
            case EAST :
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
