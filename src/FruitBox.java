import java.util.ArrayList;
import java.util.List;

public class FruitBox<E extends Fruit> {
    List<E> fruitBox = new ArrayList<>();

    public void addFruit(E element) {
        fruitBox.add(element);
    }

    public void printBox() {
        System.out.println(fruitBox.toString());
    }
}
