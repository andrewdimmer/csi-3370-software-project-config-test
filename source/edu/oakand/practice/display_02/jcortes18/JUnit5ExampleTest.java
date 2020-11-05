import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@DisplayName("JUnit 5 Example")
class Junit5exampletest {

  @BeforeAll
  static void beforeAll() {

    System.out.println("Before all test methods");
  }

  @BeforeEach
  void beforeEach() {

    System.out.println("Before each test methods");
  }

  @AfterEach
  void afterEach() {

    System.out.println("After each test methods");
  }

  @AfterAll
  static void afterAll() {

    System.out.println("After all test methods");
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
