package builder;

/**
 * @author:muming
 * @date:2018/12/1 13:20
 * @description:
 */
public class SxtAirShipBulider implements AirShipBuilder {
    @Override
    public Engine builderEngine() {
        return new Engine("muming");
    }

    @Override
    public OrbitalModule buliderOrabitalModule() {
        return new OrbitalModule("muming");
    }

    @Override
    public EscapeTower buliderEscapeTower() {
        return new EscapeTower("muming");

    }
}
