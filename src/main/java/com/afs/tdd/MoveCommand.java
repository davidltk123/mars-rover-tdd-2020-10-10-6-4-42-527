package com.afs.tdd;

public class MoveCommand implements Command {
    private MarsRover marsRover;

    public MoveCommand(MarsRover marsRover){
        this.marsRover = marsRover;
    }

    @Override
    public void execute() {
        this.move();
    }
    //https://lakesd6531.pixnet.net/blog/post/348285382-java%5Bdesign-pattern%E8%A8%AD%E8%A8%88%E6%A8%A1%E5%BC%8F%5D%E5%91%BD%E4%BB%A4%E6%A8%A1%E5%BC%8F(command-pattern
    private void move() {
        switch(this.marsRover.getDirection()){
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
}
