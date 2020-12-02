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

    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return false;
        }
        if(obj.getClass() != this.getClass()){
            return false;
        }
        LocationInfo other = (LocationInfo) obj;
        if(this.locationX==other.locationX && this.locationY==other.locationY && this.direction.equals(other.direction)){
            return true;
        }
        return false;
    }

}
