package prototype;

import java.io.*;
import java.util.Date;

/**
 * @author:muming
 * @date:2018/12/1 13:49
 * @description:原型模式(序列化和反序列化实现深克隆)
 */
public class Cilent03 {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Sheep s1 = new Sheep("少利", new Date(21321313231L));

        //序列化
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(s1);
        s1.setName("heiehieh");
        byte[] bytes = bos.toByteArray();
        //反序列化
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Sheep s2 = (Sheep) ois.readObject();

        System.out.println(s1.toString());
        System.out.println(s2.toString());


    }
}
