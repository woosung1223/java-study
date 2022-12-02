public class Fruit {
    static class Apple extends Fruit {
    }

    static class Grape extends Fruit {
    }

    @Override
    public String toString() {
        if (this instanceof Apple) {
            return "사과";
        }
        if (this instanceof Grape) {
            return "포도";
        }
        return "";
    }
}
