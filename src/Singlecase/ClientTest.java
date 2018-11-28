package Singlecase;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author:muming
 * @date:2018/11/28 11:24
 * @description:测试反射和反序列化
 */
public class ClientTest {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        SinglecaseDemo06 s = SinglecaseDemo06.getInstance();
        SinglecaseDemo06 ss = SinglecaseDemo06.getInstance();

        Class<SinglecaseDemo06> claess = (Class<SinglecaseDemo06>) Class.forName("SinglecaseDemo06");
        Constructor<SinglecaseDemo06> constructor = claess.getDeclaredConstructor(null);
        SinglecaseDemo06 s3 = constructor.newInstance();
        SinglecaseDemo06 s4 = constructor.newInstance();
    }
}
