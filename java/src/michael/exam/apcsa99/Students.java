package michael.exam.apcsa99;

import java.util.List;

public class Students {
    private List<StudentInfo> roster;

    public Students(List<StudentInfo> roster) {
        super();
        this.roster = roster;
    }
    
    public List<StudentInfo> getRoster() {
        return roster;
    }

    public void computeGPA(int numStudents) {
        for (int i = 0; i < numStudents; i++) {
            StudentInfo currentStudent = roster.get(i);
            if (currentStudent.getCreditHours() == 0) {
                currentStudent.setGPA(0.0);
            } else {
                currentStudent.setGPA(currentStudent.getGradePoints() / currentStudent.getCreditHours());
            }
        }
    }
    
    public boolean isSenior(StudentInfo student) {
        if (student.getCreditHours() >= 125 && student.getGPA() >= 2.0) {
            return true;
        }
        return false;
    }
    
    public void fillSeniorList(int numStudents, List<StudentInfo> seniors) {
        for (int i = 0; i < numStudents; i++) {
            StudentInfo currentStudent = roster.get(i);
            if (isSenior(currentStudent)) {
                seniors.add(currentStudent);
            }
        }
    }
}
