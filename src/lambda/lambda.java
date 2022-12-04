package lambda;

public class lambda {
    public void run() {
        MyFunction f = (a, b) -> a > b ? a : b;
        System.out.println(f.max(1, 2));
    }
}
