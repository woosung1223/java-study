import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main test = new Main();
        test.start();
    }

    public void start() {
        Child child = new Child(1, 2);

        child.add();
        child.subtract();
    }
    
    public class Parent {
        private int x, y;

        public Parent(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void add() {
            System.out.println(x + y);
        }

        public void subtract() {
            System.out.println(x - y);
        }
    }


    public class Child extends Parent {
        public Child(int x, int y) {
            super(x, y);
        }
    }
}