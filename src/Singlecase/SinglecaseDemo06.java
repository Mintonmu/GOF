package Singlecase;

import org.jetbrains.annotations.Contract;

import java.io.Serializable;

/**
 * @author:muming
 * @date:2018/11/28 11:36
 * @description:懒汉式(反射漏洞)
 */
public class SinglecaseDemo06 implements Serializable {

    private static SinglecaseDemo06 s;

    private SinglecaseDemo06() {
        if (s != null) {
            throw new RuntimeException();
        }
    }

    public static synchronized SinglecaseDemo06 getInstance() {
        if (s == null) {
            s = new SinglecaseDemo06();
        }
        return s;
    }

    @Contract(pure = true)
    private Object readResolve() {
        return s;
    }
}
