package edu.oakland.test.middleware01;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("JUnit 5 Example")
public class Junit5ExampleTest {

  @Test
  @DisplayName("First test")
  void firstTest() {
    System.out.println("First test method");
  }

  @Test
  @DisplayName("Second test")
  void secondTest() {
    System.out.println("Second test method");
  }
}
