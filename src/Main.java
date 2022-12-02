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
        FruitBox<Fruit.Grape> grapeTest = new FruitBox<>();
        grapeTest.addFruit(new Fruit.Grape());
        grapeTest.addFruit(new Fruit.Grape());
        grapeTest.printBox();

        FruitBox<Fruit.Apple> appleTest = new FruitBox<>();
        appleTest.addFruit(new Fruit.Apple());
        appleTest.addFruit(new Fruit.Apple());
        appleTest.printBox();

//        FruitBox<Integer> integerTest = new FruitBox<Integer>(); // ERROR. Fruit의 자손만 타입이 될 수 있다.
    }

    private static void juicePractice() {
        FruitBox<Fruit.Grape> grapeTest = new FruitBox<>();
        grapeTest.addFruit(new Fruit.Grape());
        grapeTest.addFruit(new Fruit.Grape());

        Juice.makeJuice(grapeTest);
    }
}