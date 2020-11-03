import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

@DisplayName("JUnit 5 Example")
class Junit5ExampleTest {

  @BeforeAll 
    static void beforeAll() {
    System.out.println("Before all test method");
  }

  @BeforeEach
    void beforeEach() {
    System.out.println("Before each test method");
  }

  @AfterEach
    void aftereach() {
    System.out.println("After each test method");
  }

  @AfterAll
    static void afterall() {
    System.out.println("After all test method");
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