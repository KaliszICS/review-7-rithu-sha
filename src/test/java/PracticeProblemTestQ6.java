import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PracticeProblemTestQ6 {
    @Test
    @DisplayName("")
    void highOrLowTest1() {
    // Enter code here
    assertEquals("High", PracticeProblem.highOrLow(101));
    }

    @Test
    @DisplayName("")
    void highOrLowTest2() {
    // Enter code here
    assertEquals("High", PracticeProblem.highOrLow(1000098));
    }

    @Test
    @DisplayName("")
    void highOrLowTest3() {
    // Enter code here
    assertEquals("Low", PracticeProblem.highOrLow(100));
    }

    @Test
    @DisplayName("")
    void highOrLowTest4() {
    // Enter code here
    assertEquals("Low", PracticeProblem.highOrLow(-100));
    }

    @Test
    @DisplayName("")
    void highOrLowtest5() {
    // Enter code here
    assertEquals("Low", PracticeProblem.highOrLow(0));
    }
}
