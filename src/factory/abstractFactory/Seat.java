package factory.abstractFactory;

/**
 * @author:muming
 * @date:2018/11/30
 * @description:
 */
public interface Seat {
    void massage();
}

class LuxurySeat implements Seat {

    @Override
    public void massage() {
        System.out.println("可以自动按摩 ");
    }
}


class LowerSeat implements Seat {

    @Override
    public void massage() {
        System.out.println("不能按摩 ");
    }
}