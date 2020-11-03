import org.junit.jupiter.api.*;
@DisplayName("JUnit 5 Example")
class Junit5ExampleTest {

  @BeforeAll
    static void beforeAll() {
        System.out.println("Before all test methods");
    }
  @BeforeEach
    void beforeEach() {
        System.out.println("Before each test method");
    }
  @AfterEach
    void afterEach() {
        System.out.println("After each test method");
    }
  @AfterAll
    static void afterAll() {
        System.out.println("After all test methods");
    }
}