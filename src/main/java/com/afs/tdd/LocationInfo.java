package com.afs.tdd;

public class LocationInfo {
    private int locationX;
    private int locationY;
    private String direction;
    private static final String NORTH = "N";
    private static final String WEST = "W";
    private static final String SOUTH = "S";
    private static final String EAST = "E";

    public LocationInfo(int locationX, int locationY, String direction){
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public void addLocationX(){
        this.locationX++;
    }
    public void addLocationY(){
        this.locationY++;
    }
    public void decreaseLocationX(){
        this.locationX--;
    }
    public void decreaseLocationY(){
        this.locationY--;
    }
}
