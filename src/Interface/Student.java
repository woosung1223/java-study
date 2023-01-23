package Interface;

public class Student implements Person {

    @Override
    public void introduce() {
        System.out.println("I'm person!");
    }
}
