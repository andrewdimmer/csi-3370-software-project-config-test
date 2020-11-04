import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("JUnit 5 Example")
class Junit5ExampleTest {

  @BeforeAll 
  static void beforeAll() {
    system.out.println("Before all test method");
  }

  @BeforeEach
  void beforeEach() {
    system.out.println("Before each test method");   
  }

  @AfterEach
  void aftereach() {
    system.out.println("After each test method");   
  }

  @AfterAll
  static void afterall() {
    system.out.println("After all test method");   
  }

  @Test 
  @DisplayName("First test")
  void firstTest() {
    system.out.println("First test method");   
  }

  @Test 
  @DisplayName("Second test")
  void secondTest() {
    system.out.println("Second test method");
  }
}
