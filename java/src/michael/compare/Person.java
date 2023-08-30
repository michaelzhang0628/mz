package michael.compare;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name, int age, int weight, int height) {
        super();
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Person [" + name + "]";
    }
}
