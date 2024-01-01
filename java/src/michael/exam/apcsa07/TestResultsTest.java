package michael.exam.apcsa07;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestResultsTest {

    @Test
    void testGetHighestScore() {
        ArrayList<String> key = new ArrayList<String> ();
        key.add("A");
        key.add("C");
        key.add("D");
        ArrayList<String> answersDave = new ArrayList<String> ();
        answersDave.add("A");
        answersDave.add("B");
        answersDave.add("D");
        StudentAnswerSheet dave = new StudentAnswerSheet(answersDave, "Dave");
        assertEquals(1.75, dave.getScore(key));
        ArrayList<String> answersPaul = new ArrayList<String> ();
        answersPaul.add("A");
        answersPaul.add("B");
        answersPaul.add("?");
        StudentAnswerSheet paul = new StudentAnswerSheet(answersPaul, "Paul");
        assertEquals(.75, paul.getScore(key));
        ArrayList<String> answersEmma = new ArrayList<String> ();
        answersEmma.add("A");
        answersEmma.add("?");
        answersEmma.add("D");
        StudentAnswerSheet emma = new StudentAnswerSheet(answersEmma, "Emma");
        assertEquals(2, emma.getScore(key));
        ArrayList<StudentAnswerSheet> sheets = new ArrayList<StudentAnswerSheet> ();
        sheets.add(dave);
        sheets.add(paul);
        sheets.add(emma);
        TestResults tr = new TestResults(sheets);
        assertEquals("Emma", tr.highestScoringStudent(key));
    }

}
