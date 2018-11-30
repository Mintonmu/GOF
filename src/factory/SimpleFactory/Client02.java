package factory.SimpleFactory;

/**
 * @author:muming
 * @date:2018/11/30 00:07
 * @description:简单工厂
 */
public class Client02 {
    public static void main(String[] agrs) {
        Car c1 = CarFactory.creatCar("奥迪");
        Car c2 = CarFactory.creatCar("比亚迪");
        Car c3 = new CarFactory02().creatAudi();
        c3.run();
        c1.run();
        c2.run();
    }

}
