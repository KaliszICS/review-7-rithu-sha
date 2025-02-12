import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PracticeProblemTestQ2 {
    @Test
    @DisplayName("")
    void teacherOrStudentTest1() {
    // Enter code here
    assertEquals("Teacher", PracticeProblem.teacherOrStudent("Kalisz"));
    }

    @Test
    @DisplayName("")
    void teacherOrStudentTest2() {
    // Enter code here
    assertEquals("Student", PracticeProblem.teacherOrStudent("student"));
    }

    @Test
    @DisplayName("")
    void teacherOrStudentTest3() {
    // Enter code here
    assertEquals("Student", PracticeProblem.teacherOrStudent(""));
    }

    @Test
    @DisplayName("")
    void teacherOrStudentTest4() {
    // Enter code here
    assertEquals("Student", PracticeProblem.teacherOrStudent("a"));
    }

    @Test
    @DisplayName("")
    void teacherOrStudentTest5() {
    // Enter code here
    assertEquals("Student", PracticeProblem.teacherOrStudent("kalisz"));
    }
}
