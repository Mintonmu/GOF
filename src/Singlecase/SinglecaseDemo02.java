package Singlecase;

import org.jetbrains.annotations.Contract;

/**
 * @author:muming
 * @date:2018/11/28 11:22
 * @description:饿汉式
 */
public class SinglecaseDemo02 {
    //加载类的时候线程安全

    private static SinglecaseDemo02 s = new SinglecaseDemo02();

    private SinglecaseDemo02() {
    }

    @Contract(pure = true)
    public static SinglecaseDemo02 getInstance() {
        return s;
    }
}

