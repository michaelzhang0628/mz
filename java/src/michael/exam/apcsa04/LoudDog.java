package michael.exam.apcsa04;

public class LoudDog extends Dog {
    public LoudDog(String name) {
        super(name);
    }

    public String speak() {
        return super.speak() + super.speak();
    }
}
