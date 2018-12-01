package prototype;

import java.util.Date;

/**
 * @author:muming
 * @date:2018/12/1 13:49
 * @description:原型模式(深克隆)
 */
public class Cilent02 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //深克隆
        Sheep s1 = new Sheep("少利", new Date(21321313231L));
        Sheep s2 = (Sheep) s1.clone();
        s1.setName("多利");
        s1.setBirthday(new Date(1231312321L));
        System.out.println(s1.toString());
        System.out.println(s2.toString());


    }
}
