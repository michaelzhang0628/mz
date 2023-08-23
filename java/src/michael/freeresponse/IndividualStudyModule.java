package michael.freeresponse;

import java.util.Scanner;

public class IndividualStudyModule {
    static final String GOOD = "Start the next unit";
    static final String LESS_GOOD = "Redo the homework assignments";
    static final String LESS_BAD = "Retake the diagnostic test";
    static final String BAD = "Go back to the beginning of this unit";

    private int score;
    private String password;
    private Scanner scanner;

    public IndividualStudyModule(int aScore, String p) {
        score = aScore;
        password = p;
        scanner = new Scanner(System.in);
    }

    // Return string read from keyboard
    public String readString() {
        System.out.println("Enter password:");
        return scanner.nextLine();
    }

    // Returns a string based on score value
    // score must be from 0 to 100
    public String assessProgress() {
        String str = "";
        if (score <= 40) {
            str = BAD;
        } else if (score <= 60) {
            str = LESS_BAD;
        } else if (score <= 80) {
            str = LESS_GOOD;
        } else {
            str = GOOD;
        }
        return str;
    }

    // Return True if password is correct
    // Returns false after three incorrect attempts
    public boolean enterPassword() {
        for (int i = 0; i < 3; i++) {
            String str = readString();
            if (str.equals(password)) {
                return true;
            } else {
                System.out.println("Wrong password");
            }
        }
        return false;
    }

    public final static void main(String[] args) {
        IndividualStudyModule m = new IndividualStudyModule(80, "z");
        // System.out.println("Got the right password? " + m.enterPassword());
        System.out.println("How was your performance for this unit? " + m.assessProgress());
    }
}
