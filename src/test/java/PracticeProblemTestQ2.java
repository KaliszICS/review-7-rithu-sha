import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PracticeProblemTestQ2 {
    @Test
    @DisplayName("")
    void teacherOrStudentTest1() {
    // Enter code here
    assertEquals("Teacher", Main.teacherOrStudent("Kalisz"));
    }

    @Test
    @DisplayName("")
    void teacherOrStudentTest2() {
    // Enter code here
    assertEquals("Student", Main.teacherOrStudent("student"));
    }

    @Test
    @DisplayName("")
    void teacherOrStudentTest3() {
    // Enter code here
    assertEquals("Student", Main.teacherOrStudent(""));
    }

    @Test
    @DisplayName("")
    void teacherOrStudentTest4() {
    // Enter code here
    assertEquals("Student", Main.teacherOrStudent("a"));
    }

    @Test
    @DisplayName("")
    void teacherOrStudentTest5() {
    // Enter code here
    assertEquals("Student", Main.teacherOrStudent("kalisz"));
    }
}
