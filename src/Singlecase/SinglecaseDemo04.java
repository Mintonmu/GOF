package Singlecase;

import org.jetbrains.annotations.Contract;

/**
 * @author:muming
 * @date:2018/11/28 11:36
 * @description:静态内部类
 */
public class SinglecaseDemo04 {

    private SinglecaseDemo04() {
    }

    @Contract(pure = true)
    public static SinglecaseDemo04 getInstance() {
        return SinglecaseDemoInstance.s;
    }

    private static class SinglecaseDemoInstance {
        private static SinglecaseDemo04 s = new SinglecaseDemo04();

    }
}
