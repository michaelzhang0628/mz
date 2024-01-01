package michael.exam.apcsa04;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "meow";
    }
}
