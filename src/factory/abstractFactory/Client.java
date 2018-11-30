package factory.abstractFactory;

/**
 * @author:muming
 * @date:2018/11/30 10:42
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        CarFactory carFactory = new LuxuryCarFactory();
        Engine e = carFactory.createEngine();
        e.run();
        e.start();

        CarFactory carFactory1 = new LowerCarFactory();
        Seat seat = carFactory1.createSeat();
        seat.massage();
    }
}
