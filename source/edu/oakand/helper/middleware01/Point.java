package edu.oakland.helper.middleware01;

public class Point {

  private int coordX;
  private int coordY;

  public Point(int coordX, int coordY) {
    this.coordX = coordX;
    this.coordY = coordY;
    public int getX() {
      return coordX;
    }
    
    public int getY() {
      return coordY;
    }
  }
}
