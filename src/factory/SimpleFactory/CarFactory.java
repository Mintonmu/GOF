package factory.SimpleFactory;

import org.jetbrains.annotations.Nullable;

/**
 * @author:muming
 * @date:2018/11/30 00:10
 * @description:
 */
public class CarFactory {
    @Nullable
    public static Car creatCar(String type) {
        if ("奥迪".equals(type)) {
            return new Audi();
        } else if ("比亚迪".equals(type)) {
            return new Byd();
        }
        return null;
    }
}
