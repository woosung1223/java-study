package Interface;

public class Fightable implements Movable, Attackable {
    @Override
    public void move(int x, int y) {

    }

    @Override
    public void attack() {

    }

    // 인터페이스는 다중 상속이 가능하다.
    // 다중 상속을 받는 대상은 클래스일수도, 인터페이스일수도 있다.
    // 다만 클래스의 경우 인터페이스의 본질에 따라 구현을 강제한다.
}
