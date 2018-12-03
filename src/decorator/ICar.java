package decorator;

/**
 * @author:muming
 * @date:2018/12/3
 * @description:
 */
public interface ICar {

    void move();
}


class Car implements ICar {

    @Override
    public void move() {

        System.out.println("陆地上跑");


    }
}

class SuperCar implements ICar {

    private ICar car;


    public SuperCar(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();

    }
}

class FlySuperCar extends SuperCar {

    public FlySuperCar(ICar car) {
        super(car);
    }

    public void fly() {
        System.out.println("天上飞");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }

}