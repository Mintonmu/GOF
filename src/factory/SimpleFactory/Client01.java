package factory.SimpleFactory;

/**
 * @author:muming
 * @date:2018/11/30 00:07
 * @description:没有工厂
 */
public class Client01 {
    public static void main(String[] agrs) {

        Car c1 = new Audi();
        Car c2 = new Byd();
        c1.run();
        c2.run();
    }

}
