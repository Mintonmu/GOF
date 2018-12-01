package prototype;

import java.util.Date;

/**
 * @author:muming
 * @date:2018/12/1 13:42
 * @description:原型模式(浅克隆)
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        //浅克隆
        Sheep s1 = new Sheep("少利", new Date(21321313231L));
        System.out.println(s1.toString());
        Sheep s2 = (Sheep) s1.clone();
        System.out.println(s2.toString());


    }
}
