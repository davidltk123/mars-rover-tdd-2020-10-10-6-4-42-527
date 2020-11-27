package com.afs.tdd;

public class MarsRover {
    private static final String NORTH = "N";
    private static final String WEST = "W";
    private static final String SOUTH = "S";
    private static final String EAST = "E";
    private LocationInfo locationInfo;

    public MarsRover(int locationX, int locationY, String direction) {
        this.locationInfo = new LocationInfo(locationX,locationY,direction);
    }

    public void turnLeft() {
        this.locationInfo.turnLeft();
    }

    public void turnRight() {
        this.locationInfo.turnRight();
    }

    public void move() {
        this.locationInfo.move();
    }

    public LocationInfo getLocationInfo(){
        return this.locationInfo;
    }

}
