
public class Main {
    public static void main(String[] args) {
//        genericListPractice();
        genericTypePractice();
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
}