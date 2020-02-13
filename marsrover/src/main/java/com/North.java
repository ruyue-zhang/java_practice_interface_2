package com;

public class North implements Orientation{
    @Override
    public Direction turnRight() {
        return new Direction('W', new North());
    }

    @Override
    public Direction turnLeft() {
        return new Direction('E', new North());
    }
}
