import AbstractClass.Person;
import AbstractClass.Student;
import Polymorphism.Teacher;

public class Main {
    public static void main(String[] args) {
        Main test = new Main();
        test.start();
    }

    public void start() {
        Person student = new Student(20);
        student.printAge();
        student.introduce();

        // 추상 클래스는 구현체를 강제한다.
        // 즉, 추상 클래스를 인스턴스로 선언할 수 없다.
        // 단, 추상 클래스라고 해서 생성자, 멤버 변수, 추상 메서드가 아닌 메서드를 가질 수 없는 것은 아니다.
    }
}