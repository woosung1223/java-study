public class Juice {
    public static void makeJuice(FruitBox<? extends Fruit> anyThing) {
        System.out.println(anyThing.fruitBox.size() + "개의 주스를 만들었습니다.");
    }
}
