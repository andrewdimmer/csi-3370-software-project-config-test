package edu.oakland.helper.middleware01;

public class Point {

  private int coordX;
  private int coordY;
  private int coordZ;

  /**
   * Point Class
   */
  public Point(int coordX, int coordY, int coordZ) {
    this.coordX = coordX;
    this.coordY = coordY;
    this.coordZ = coordZ;
  }

  public int getX() {
    return coordX;
  }
    
  public int getY() {
    return coordY;
  }

  public int getZ() {
    return coordZ;
  }
  
}
