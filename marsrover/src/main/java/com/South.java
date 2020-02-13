package com;

public class South implements Orientation {
    @Override
    public Direction turnRight() {
        return new Direction('E', new South());
    }

    @Override
    public Direction turnLeft() {
        return new Direction('W', new South());
    }
}
