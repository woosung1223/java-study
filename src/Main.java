import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main test = new Main();
        test.start();
    }

    public void start() {
        Parent parent = new Parent();
        parent.method();

        Parent child = new Child();
        child.method();
    }

    public class Parent {

        protected void method() throws IOException {
            System.out.println("this is parent");
        }
    }


    public class Child extends Parent {

        @Override
        public void method() throws Exception {
            System.out.println("this is child");
        }
    }
}