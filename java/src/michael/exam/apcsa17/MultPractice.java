package michael.exam.apcsa17;

public class MultPractice implements StudyPractice{
    private int firstNum;
    private int secondNum;
    
    public MultPractice(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    @Override
    public String getProblem() {
        return firstNum + " TIMES " + secondNum;
    }

    @Override
    public void nextProblem() {
        secondNum++;
    }

}
