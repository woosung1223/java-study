package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericList<E> {
    private final List<E> genericList = new ArrayList<>();

    public void pushElement(E element) {
        genericList.add(element);
    }

    public E popElement() {
        return genericList.remove(genericList.size() - 1);
    }
}
