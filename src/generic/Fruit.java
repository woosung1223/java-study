package generic;

public class Fruit {
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