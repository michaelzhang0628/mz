package michael.learn;

public class Student {
    private String name = null;
    private int age = 0;
    private int grade = 100;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // static in front of a variable means it is a class variable
    static int absence = 0; 
    
    public Student(String n) {
        this.name = n;
    }

    public Student(String n, int a) {
        this(n);
        this.age = a;
    }

    public Student(String n, int a, int g) {
        this(n, a);
        this.grade = g;
    }

    public void punch(int count) {
        System.out.println("Punch " + count + " times.");
    }
    
    // static in front of a method means it is a class method
    public static void absent() {
        absence++;
    }
}
