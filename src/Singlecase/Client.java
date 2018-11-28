package Singlecase;

/**
 * @author:muming
 * @date:2018/11/28 11:24
 * @description:
 */
public class Client {

    public static void main(String[] args) {
        SinglecaseDemo s = SinglecaseDemo.getInstance();
        SinglecaseDemo ss = SinglecaseDemo.getInstance();
        System.out.println(s == ss);
    }
}
