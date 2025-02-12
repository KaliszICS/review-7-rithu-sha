import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PracticeProblemTestQ7 {
    @Test
    @DisplayName("")
    void isHelloTest1() {
    // Enter code here
    assertEquals("The word is Hello", PracticeProblem.isHello("Hello"));
    }

    @Test
    @DisplayName("")
    void isHelloTest2() {
    // Enter code here
    assertEquals("The word is not Hello", PracticeProblem.isHello("hello"));
    }

    @Test
    @DisplayName("")
    void isHelloTest3() {
    // Enter code here
    assertEquals("The word is not Hello", PracticeProblem.isHello(""));
    }

    @Test
    @DisplayName("")
    void isHelloTest4() {
    // Enter code here
    assertEquals("The word is not Hello", PracticeProblem.isHello("H"));
    }

    @Test
    @DisplayName("")
    void isHelloTest5() {
    // Enter code here
    assertEquals("The word is not Hello", PracticeProblem.isHello("Why Hello There"));
    }
}
