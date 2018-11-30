package factory.abstractFactory;

/**
 * @author:muming
 * @date:2018/11/30 10:38
 * @description:
 */
public interface CarFactory {
    Engine createEngine();

    Seat createSeat();

    Tyre createTyre();
}

class LuxuryCarFactory implements CarFactory {

    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Seat createSeat() {
        return new LuxurySeat();
    }

    @Override
    public Tyre createTyre() {
        return new LuxuryTyre();
    }
}

class LowerCarFactory implements CarFactory {

    @Override
    public Engine createEngine() {
        return new LowerEngine();
    }

    @Override
    public Seat createSeat() {
        return new LowerSeat();
    }

    @Override
    public Tyre createTyre() {
        return new LowerTyre();
    }
}