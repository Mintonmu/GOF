package Singlecase;

/**
 * @author:muming
 * @date:2018/11/28 11:24
 * @description:
 */
public class Client {

    public static void main(String[] args) {
        SinglecaseDemo02 s = SinglecaseDemo02.getInstance();
        SinglecaseDemo02 ss = SinglecaseDemo02.getInstance();
        System.out.println(s == ss);
    }
}
