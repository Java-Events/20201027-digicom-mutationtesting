package junit.org.rapidpm.event.digicom.p001;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class TestConditional {
  @Test
  @DisplayName("Run everywehre")
  void test001() {
    System.out.println("Run always");
  }

  @Test
  @EnabledOnOs({OS.LINUX})
  @DisplayName("Run on linux")
  void test002() {
    System.out.println("On linux");
  }

  @Test
  @DisplayName("Run on windows")
  @EnabledOnOs({OS.WINDOWS})
  void test003() {
    System.out.println("On Windows");
  }
}
