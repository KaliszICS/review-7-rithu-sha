import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PracticeProblemTestQ4 {
    @Test
    @DisplayName("")
    void isFiveTest1() {
    // Enter code here
    assertEquals("The number is Five", PracticeProblem.isFive(5));
    }

    @Test
    @DisplayName("")
    void isFiveTest2() {
    // Enter code here
    assertEquals("The number is not Five", PracticeProblem.isFive(-5));
    }

    @Test
    @DisplayName("")
    void isFiveTest3() {
    // Enter code here
    assertEquals("The number is not Five", PracticeProblem.isFive(0));
    }

    @Test
    @DisplayName("")
    void isFiveTest4() {
    // Enter code here
    assertEquals("The number is not Five", PracticeProblem.isFive(4));
    }

    @Test
    @DisplayName("")
    void isFiveTest5() {
    // Enter code here
    assertEquals("The number is not Five", PracticeProblem.isFive(500));
    }
}
