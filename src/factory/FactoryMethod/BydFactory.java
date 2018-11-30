package factory.FactoryMethod;

/**
 * @author:muming
 * @date:2018/11/30 00:23
 * @description:
 */
public class BydFactory implements CarFactory {
    @Override
    public NewCar createCar() {
        return (NewCar) new Byd();
    }
}
