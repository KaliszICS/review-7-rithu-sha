import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class PracticeProblemTestQ1 {

  @Test
  @DisplayName("")
  void evenOrOddTest1() {
    // Enter code here
    assertEquals("Odd", PracticeProblem.evenOrOdd(5));
  }

  @Test
  @DisplayName("")
  void evenOrOddTest2() {
    // Enter code here
    assertEquals("Even", PracticeProblem.evenOrOdd(86));
  }

  @Test
  @DisplayName("")
  void evenOrOddTest3() {
    // Enter code here
    assertEquals("Even", PracticeProblem.evenOrOdd(0));
  }

  @Test
  @DisplayName("")
  void evenOrOddTest4() {
    // Enter code here
    assertEquals("Odd", PracticeProblem.evenOrOdd(-9));
  }

  @Test
  @DisplayName("")
  void evenOrOddTest5() {
    // Enter code here
    assertEquals("Even", PracticeProblem.evenOrOdd(-50));
  }

}
