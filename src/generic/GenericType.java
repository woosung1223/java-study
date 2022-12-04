package generic;

public class GenericType<T> {
    private T data;

    public void setter(T data) {
        this.data = data;
    }

    public T getter() {
        return this.data;
    }

    public void doSomeThing() {
        data.hashCode();
        // data는 타입이 정해져 있지 않기에 Object 메소드만 사용 가능한 것으로 보임.
        // 반면 List 등은 추상 클래스이기 때문에 Object 이외에도 List의 메소드도 사용 가능.
    }
}
