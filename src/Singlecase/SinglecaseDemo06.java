package Singlecase;

/**
 * @author:muming
 * @date:2018/11/28 11:36
 * @description:懒汉式(反射漏洞)
 */
public class SinglecaseDemo06 {
    private static SinglecaseDemo06 s;

    private SinglecaseDemo06() {
    }

    public static synchronized SinglecaseDemo06 getInstance() {
        if (s == null) {
            s = new SinglecaseDemo06();
        }
        return s;
    }
}
