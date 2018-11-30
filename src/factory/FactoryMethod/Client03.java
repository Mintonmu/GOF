package factory.FactoryMethod;

/**
 * @author:muming
 * @date:2018/11/30 00:25
 * @description:
 */
public class Client03 {
    public static void main(String[] args) {
        NewCar c1 = new BydFactory().createCar();
        NewCar c2 = new AudiFactory().createCar();
        c1.run();
        c2.run();
    }
}
