package junit.org.rapidpm.event.digicom.p001;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class TestNonStatic {

  @BeforeAll
  void beforeAll() {
    System.out.println("Before all tests");
  }

  @AfterAll
  void afterAll() {
    System.out.println("After all tests");
  }

  @BeforeEach
  void beforeEach() {
    System.out.println("Before each test");
  }

  @AfterEach
  void afterEach() {
    System.out.println("After each test");
  }

  @Test
  @DisplayName("The first test")
  void test001() {
    System.out.println("Test 001");
  }

  @Test
  @DisplayName("The second test")
  void test002() {
    System.out.println("Test 002");
  }

}
