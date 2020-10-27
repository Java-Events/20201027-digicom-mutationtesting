package junit.org.rapidpm.event.digicom.p001;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.rapidpm.event.digicom.p001.Person;

import static org.junit.jupiter.api.Assertions.*;

public class TestAssertations {
  @Test
  @DisplayName("Test simple assertations")
  void test001() {
    assertEquals(2, 2);
    assertEquals(4, 4, "The optional assertion message is now the last parameter.");
    assertTrue('a' < 'b', () -> "Assertion messages can be lazily evaluated -- "
                                + "to avoid constructing complex messages unnecessarily.");
  }

  @Test
  @DisplayName("Test grouped exception")
  void test002() {
    // GIVEN
    Person person = new Person();

    // WHEN
    person.setFirstName("John");
    person.setLastName("Doe");

    // THEN
    assertAll("person check", () -> assertEquals("John", person.getFirstName()),
              () -> assertEquals("Doe", person.getLastName()));
  }

  @Test
  @DisplayName("Exception Testing")
  void test003() {
    Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
      throw new IllegalArgumentException("a message");
    });
    assertEquals("a message", exception.getMessage());
  }

}
