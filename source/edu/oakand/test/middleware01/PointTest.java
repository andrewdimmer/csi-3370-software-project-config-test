package edu.oakland.test.middleware01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.oakland.helper.middleware01.Point;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("JUnit 5 Point Test")
public class PointTest {

  private int coordX = (int) (Math.random() * 100);
  private int coordY = (int) (Math.random() * 100);
  private int coordZ = (int) (Math.random() * 100);

  @Test
  @DisplayName("coordX stored correctly")
  void coordxEqual() {
    Point p = new Point(coordX, coordY, coordZ);
    assertEquals(p.getX(), coordX);
  }

  @Test
  @DisplayName("coordY stored correctly")
  void coordyEqual() {
    Point p = new Point(coordX, coordY, coordZ);
    assertEquals(p.getY(), coordY);
  }

  @Test
  @DisplayName("coordZ stored correctly")
  void coordzEqual() {
    Point p = new Point(coordX, coordY, coordZ);
    assertEquals(p.getZ(), coordZ);
  }
}
