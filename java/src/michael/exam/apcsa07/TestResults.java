package michael.exam.apcsa07;

import java.util.ArrayList;

public class TestResults {
    private ArrayList<StudentAnswerSheet> sheets;

    public TestResults(ArrayList<StudentAnswerSheet> sheets) {
        super();
        this.sheets = sheets;
    }

    public String highestScoringStudent(ArrayList<String> key) {
        int maxScore = 0;
        for (int i = 1; i < sheets.size(); i++) {
            if (sheets.get(i).getScore(key) > sheets.get(maxScore).getScore(key)) {
                maxScore = i;
            }
        }
        return sheets.get(maxScore).getName();
    }
}
