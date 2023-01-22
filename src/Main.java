import Polymorphism.Person;
import Polymorphism.Student;
import Polymorphism.Teacher;

public class Main {
    public static void main(String[] args) {
        Main test = new Main();
        test.start();
    }

    public void start() {
        Person student = new Student();
        Person teacher = new Teacher();

        Person person = (Person)student;
        person.speak();
        // I'm student

        Person person2 = (Person)teacher;
        person2.speak();
        //I'm Teacher

        // 형변환은 '자료형이 바뀌는 것'이 아닌 '참조변수가 바뀌는 것'

        Student student2 = (Student)teacher;
        student2.speak();
        // ERROR.
    }
}