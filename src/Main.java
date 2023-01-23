import Interface.Person;
import Interface.Student;
import Polymorphism.Teacher;

public class Main {
    public static void main(String[] args) {
        Main test = new Main();
        test.start();
    }

    public void start() {
        Person student = new Student();

        Person.staticMethod();
        student.defaultMethod();
        student.introduce();
    }
}