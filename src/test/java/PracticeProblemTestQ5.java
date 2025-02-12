import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PracticeProblemTestQ5 {
    @Test
    @DisplayName("")
    void positiveOrNegativeTest1() {
    // Enter code here
    assertEquals("Positive", PracticeProblem.positiveOrNegative(6));
    }

    @Test
    @DisplayName("")
    void positiveOrNegativeTest2() {
    // Enter code here
    assertEquals("Positive", PracticeProblem.positiveOrNegative(99));
    }

    @Test
    @DisplayName("")
    void positiveOrNegativeTest3() {
    // Enter code here
    assertEquals("Negative", PracticeProblem.positiveOrNegative(0));
    }

    @Test
    @DisplayName("")
    void positiveOrNegativeTest4() {
    // Enter code here
    assertEquals("Negative", PracticeProblem.positiveOrNegative(-100));
    }

    @Test
    @DisplayName("")
    void positiveOrNegativeTest5() {
    // Enter code here
    assertEquals("Negative", PracticeProblem.positiveOrNegative(-1));
    }
}
