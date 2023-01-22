package AbstractClass;

public class Student extends Person {

    public Student(int age) {
        super(age);
    }

    @Override
    public void introduce() {
        System.out.println("I'm student");
    }
}
