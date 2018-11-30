package factory.abstractFactory;

/**
 * @author:muming
 * @date:2018/11/30
 * @description:
 */
public interface Tyre {
    void revolve();
}

class LuxuryTyre implements Tyre {

    @Override
    public void revolve() {
        System.out.println("旋转不磨损");
    }
}

class LowerTyre implements Tyre {

    @Override
    public void revolve() {
        System.out.println("旋转磨损快");
    }
}
