import generic.*;

public class Main {
    public static void main(String[] args) {
//        genericListPractice();
//        genericTypePractice();
//        fruitPractice();
        juicePractice();
    }

    private static void genericListPractice() {
        GenericList<String> stringList = new GenericList<>();
        stringList.pushElement("123");
        stringList.pushElement("456");

        System.out.println(stringList.popElement());
        System.out.println(stringList.popElement());
    }

    private static void genericTypePractice() {
        GenericType<Integer> integerType = new GenericType<>();
        integerType.setter(123);
        System.out.println(integerType.getter());
    }

    private static void fruitPractice() {
        FruitBox<Grape> grapeTest = new FruitBox<>();
        grapeTest.addFruit(new Grape());
        grapeTest.addFruit(new Grape());
        grapeTest.printBox();

        FruitBox<Apple> appleTest = new FruitBox<>();
        appleTest.addFruit(new Apple());
        appleTest.addFruit(new Apple());
        appleTest.printBox();

//        generic.FruitBox<Integer> integerTest = new generic.FruitBox<Integer>(); // ERROR. Fruit의 자손만 타입이 될 수 있다.
    }

    private static void juicePractice() {
        FruitBox<Grape> grapeTest = new FruitBox<>();
        grapeTest.addFruit(new Grape());
        grapeTest.addFruit(new Grape());

        Juice.makeJuice(grapeTest);
    }
}