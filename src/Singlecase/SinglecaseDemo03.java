package Singlecase;

/**
 * @author:muming
 * @date:2018/11/28 11:36
 * @description:懒汉式
 */
public class SinglecaseDemo03 {
    private static SinglecaseDemo03 s = null;

    private SinglecaseDemo03() {
    }

    public static synchronized SinglecaseDemo03 getInstance() {
        if (s == null) {
            SinglecaseDemo03 sc;
            synchronized (SinglecaseDemo03.class) {
                sc = s;
            }
            if (sc == null) {
                synchronized (SinglecaseDemo03.class) {
                    if (sc == null) {
                        sc = new SinglecaseDemo03();
                    }
                }
            }
            s = sc;
        }
        return s;
    }
}
