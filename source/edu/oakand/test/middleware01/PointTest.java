package edu.oakland.test.middleware01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.oakland.helper.middleware01.Point;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("JUnit 5 Point Test")
public class PointTest {

    private int x = Math.floor(Math.random()*100);
    private int y = Math.floor(Math.random()*100);

  @Test
  @DisplayName("x stored correctly")
  void xEquals() {
    Point p = new Point(x, y);
    assertEquals(p.x, x);
  }

  @Test
  @DisplayName("y stored correctly")
  void yEquals() {
    Point p = new Point(x, y);
    assertEquals(p.y, y);
  }
}
