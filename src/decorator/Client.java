package decorator;

import org.junit.jupiter.api.Test;

/**
 * @author:muming
 * @date:2018/12/3 00:20
 * @description:
 */
public class Client {

    @Test
    public void Test() {
        ICar car = new Car();
        car.move();
        FlySuperCar flySuperCar = new FlySuperCar(car);
        flySuperCar.move();
    }
}
