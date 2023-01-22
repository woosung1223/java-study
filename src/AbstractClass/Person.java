package AbstractClass;

public abstract class Person {
    private final int age;

    public Person(int age) {
        this.age = age;
    }

    public abstract void introduce();
    public void printAge() {
        System.out.printf("my age is %d%n", age);
    }
}
