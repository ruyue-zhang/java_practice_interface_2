package com;

public class West implements Orientation{
    @Override
    public Direction turnLeft() {
        return new Direction('S', new West());
    }

    @Override
    public Direction turnRight() {
        return new Direction('N', new West());
    }
}
