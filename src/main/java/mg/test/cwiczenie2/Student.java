package mg.test.cwiczenie2;

public class Student {
    private final String name;
    private final int age;

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Student createWithNameAndAge(String name, int age) {
        if (name == null) {
            name = "unknown";
        }

        if (age < 10) {
            age = 10;
        }

        return new Student(name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
