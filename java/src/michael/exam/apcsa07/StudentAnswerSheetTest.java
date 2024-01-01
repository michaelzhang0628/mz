package michael.exam.apcsa07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class StudentAnswerSheetTest {

    @Test
    void testGetScore() {
        ArrayList<String> key = new ArrayList<String> ();
        key.add("A");
        key.add("C");
        key.add("D");
        key.add("E");
        key.add("B");
        key.add("C");
        key.add("E");
        key.add("B");
        key.add("B");
        key.add("C");
        ArrayList<String> answers = new ArrayList<String> ();
        answers.add("A");
        answers.add("B");
        answers.add("D");
        answers.add("E");
        answers.add("A");
        answers.add("C");
        answers.add("?");
        answers.add("B");
        answers.add("D");
        answers.add("C");
        StudentAnswerSheet sas = new StudentAnswerSheet(answers, "Dave");
        assertEquals(5.25, sas.getScore(key));
    }

}
