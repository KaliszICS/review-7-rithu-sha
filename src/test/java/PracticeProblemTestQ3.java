import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PracticeProblemTestQ3 {
    @Test
    @DisplayName("")
    void fartherFromZeroTest1() {
    // Enter code here
    assertEquals(10, Main.fartherFromZero(5));
    }

    @Test
    @DisplayName("")
    void fartherFromZeroTest2() {
    // Enter code here
    assertEquals(9, Main.fartherFromZero(4));
    }

    @Test
    @DisplayName("")
    void fartherFromZeroTest3() {
    // Enter code here
    assertEquals(-55, Main.fartherFromZero(-50));
    }

    @Test
    @DisplayName("")
    void fartherFromZeroTest4() {
    // Enter code here
    assertEquals(-16, Main.fartherFromZero(-11));
    }

    @Test
    @DisplayName("")
    void fartherFromZeroTest5() {
    // Enter code here
    assertEquals(0, Main.fartherFromZero(0));
    }
}
