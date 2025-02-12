import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PracticeProblemTestQ7 {
    @Test
    @DisplayName("")
    void isHelloTest1() {
    // Enter code here
    assertEquals("The word is Hello", Main.isHello("Hello"));
    }

    @Test
    @DisplayName("")
    void isHelloTest2() {
    // Enter code here
    assertEquals("The word is not Hello", Main.isHello("hello"));
    }

    @Test
    @DisplayName("")
    void isHelloTest3() {
    // Enter code here
    assertEquals("The word is not Hello", Main.isHello(""));
    }

    @Test
    @DisplayName("")
    void isHelloTest4() {
    // Enter code here
    assertEquals("The word is not Hello", Main.isHello("H"));
    }

    @Test
    @DisplayName("")
    void isHelloTest5() {
    // Enter code here
    assertEquals("The word is not Hello", Main.isHello("Why Hello There"));
    }
}
