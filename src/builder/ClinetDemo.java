package builder;

/**
 * @author:muming
 * @date:2018/12/1 13:28
 * @description:
 */
public class ClinetDemo {
    public static void main(String[] args) {
        AirShipDirector airShipDirector = new SxtAirShipDirector(new SxtAirShipBulider());
        AirShip ship = airShipDirector.createAirship();
        System.out.println(ship.getEngine().getName());
    }

}
