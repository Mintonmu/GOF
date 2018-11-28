package Singlecase;

/**
 * @author:muming
 * @date:2018/11/28 11:22
 * @description:
 */
public class SinglecaseDemo {
    private static SinglecaseDemo s = new SinglecaseDemo();

    private SinglecaseDemo() {
    }

    public static SinglecaseDemo getInstance() {
        return s;
    }
}

