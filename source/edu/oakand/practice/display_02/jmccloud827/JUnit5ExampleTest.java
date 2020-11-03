import org.junit.jupiter.api.*;

@DisplayName("JUnit 5 Example") 
class JUnit5ExampleTest {

	@BeforeAll 
	static void beforeAll() {
		System.out.println("Before all test methods");
	}

	@BeforeEach
 	void beforeEach() {
 		System.out.println("Before each test method");
 	}

	@AfterEach
	voidafterEach() {
		System.out.println("After each test method");
	}

	@AfterAll
	staticvoidafterAll() {
		System.out.println("After all test methods");
	}

	@Test
	@DisplayName("First test")
	voidfirstTest() {
		System.out.println("First test method");
	}
	@Test
	@DisplayName("Second test")
	void secondTest() {
		system.out.println("Second test method");
	}

}
