package com.afs.tdd;

public class MoveCommand implements Command{

    @Override
    public void execute(MarsRover marsRover) {
        marsRover.move();
    }
}
