package com;

public class Direction {
  private final char direction;
  private Orientation orientation;

  public Direction(char direction) {
    this.direction = direction;
  }

  public Direction(char direction, Orientation orientation) {
    this.direction = direction;
    this.orientation = orientation;
  }

  public Direction turnRight() {
    return orientation.turnRight();
  }

  public Direction turnLeft() {
    return orientation.turnLeft();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Direction direction1 = (Direction) o;

    return direction == direction1.direction;
  }

  @Override
  public int hashCode() {
    return (int) direction;
  }

  @Override
  public String toString() {
    return "Direction{direction=" + direction + '}';
  }

}
