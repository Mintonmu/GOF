package factory.SimpleFactory;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author:muming
 * @date:2018/11/30 00:10
 * @description:
 */
public class CarFactory02 {
    Car c = null;

    @Nullable
    public Car creatAudi() {
        return c = new Audi();
    }

    @NotNull
    @Contract(" -> new")
    public Car creatByd() {
        return c = new Byd();
    }
}
