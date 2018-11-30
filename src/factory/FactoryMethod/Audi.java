package factory.FactoryMethod;

/**
 * @author:muming
 * @date:2018/11/30 00:06
 * @description:
 */
public class Audi implements NewCar {
    @Override
    public void run() {
        System.out.println("audi is run");
    }
}
