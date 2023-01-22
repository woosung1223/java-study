import Polymorphism.Person;
import Polymorphism.Student;
import Polymorphism.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main test = new Main();
        test.start();
    }

    public void start() {
        List<Person> group = new ArrayList<>();

        group.add(new Student());
        group.add(new Teacher());

        group.forEach(Person::speak);
    }
}