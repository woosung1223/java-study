package Interface;

public interface Person {

    static void staticMethod() {
        System.out.println("this is static method");
    }

    default void defaultMethod() {
        System.out.println("this is default method");
    }

    void introduce();
}
