import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class PracticeProblemTestQ1 {

  @Test
  @DisplayName("")
  void evenOrOddTest1() {
    // Enter code here
    assertEquals("Odd", Main.evenOrOdd(5));
  }

  @Test
  @DisplayName("")
  void evenOrOddTest2() {
    // Enter code here
    assertEquals("Even", Main.evenOrOdd(86));
  }

  @Test
  @DisplayName("")
  void evenOrOddTest3() {
    // Enter code here
    assertEquals("Even", Main.evenOrOdd(0));
  }

  @Test
  @DisplayName("")
  void evenOrOddTest4() {
    // Enter code here
    assertEquals("Odd", Main.evenOrOdd(-9));
  }

  @Test
  @DisplayName("")
  void evenOrOddTest5() {
    // Enter code here
    assertEquals("Even", Main.evenOrOdd(-50));
  }

}
