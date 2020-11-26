package edu.oakland.practice.middleware02.rcapollari;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Junit Practice")
public class JunitPractice {

  @BeforeAll
  static void beforeAll() {
    System.out.println("Before all test methods");
  }

  @BeforeEach
  static void beforeEach() {
    System.out.println("Before each test method");
  }

  @AfterEach
  static void afterEach() {
    System.out.println("After each test method");
  }

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