package Singlecase;

/**
 * @author:muming
 * @date:2018/11/28 11:36
 * @description:懒汉式
 */
public class SinglecaseDemo01 {
    private static SinglecaseDemo01 s;

    private SinglecaseDemo01() {
    }

    public static synchronized SinglecaseDemo01 getInstance() {
        if (s == null) {
            s = new SinglecaseDemo01();
        }
        return s;
    }
}
