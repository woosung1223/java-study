
public class Main {
    public static void main(String[] args) {
        GenericList<String> stringList = new GenericList<>();
        stringList.pushElement("123");
        stringList.pushElement("456");

        System.out.println(stringList.popElement());
        System.out.println(stringList.popElement());
    }
}