package builder;

/**
 * @author:muming
 * @date:2018/12/1 13:22
 * @description:
 */
public class SxtAirShipDirector implements AirShipDirector {
    private AirShipBuilder builder;

    public SxtAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip createAirship() {
        Engine e = builder.builderEngine();
        OrbitalModule o = builder.buliderOrabitalModule();
        EscapeTower et = builder.buliderEscapeTower();


        AirShip ship = new AirShip();
        ship.setEngine(e);
        ship.setEscapeTower(et);
        ship.setOrbitalModule(o);
        return ship;
    }
}
