import org.junit.jupiter.api.*;

@DisplayName("Junit Practice")
class JunitPractice{
	
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