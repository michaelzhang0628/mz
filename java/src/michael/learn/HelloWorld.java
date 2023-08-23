package michael.learn;

public class HelloWorld {
    public final static void main(String[] args) {

        System.out.println("Michael says Hello World");
        Student mz = new Student("Michael", 15, 10, "Mr. D");
        System.out.println("name:" + mz.getName());
        System.out.println("age:" + mz.getAge());
        System.out.println("grade:" + mz.getGrade());
        mz.punch(8);
        Student.absent();
        Student.absent();

        Student keke = new Student("Keke", 21, 99);
        System.out.println("name:" + keke.getName());
        System.out.println("age:" + keke.getAge());
        System.out.println("grade:" + keke.getGrade());
        keke.punch(4);
        Student.absent();

        Student.absent();

        System.out.println("absent:" + Student.absence);

        Student[] students = new Student[3];
        students[0] = mz;
        students[1] = keke;
        students[2] = new Student("daddy");
        for (Student s : students) {
            System.out.println(s.getName());
        }
    }
}
