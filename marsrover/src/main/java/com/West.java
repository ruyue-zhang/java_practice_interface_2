package com;

public class West extends Direction{
    public West(char direction) {
        super(direction);
    }

    @Override
    public Direction turnLeft() {
        return new Direction('S');
    }

    @Override
    public Direction turnRight() {
        return new Direction('N');
    }
}
