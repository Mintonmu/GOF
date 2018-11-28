package Singlecase;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

/**
 * @author:muming
 * @date:2018/11/28 11:24
 * @description:
 */
public class Client {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException, IOException {
        SinglecaseDemo06 s = SinglecaseDemo06.getInstance();
        SinglecaseDemo06 ss = SinglecaseDemo06.getInstance();
//反射
//        Class<SinglecaseDemo06> clazz = (Class<SinglecaseDemo06>) Class.forName("Singlecase.SinglecaseDemo06");
//
//        Constructor<SinglecaseDemo06> constructor = clazz.getDeclaredConstructor(null);
//        constructor.setAccessible(true);
//
//        SinglecaseDemo06 s2 = clazz.newInstance();
//        SinglecaseDemo06 s3 = clazz.newInstance();
//反序列化
        FileOutputStream fileOutputStream = new FileOutputStream("./log.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(s);
        objectOutputStream.close();
        fileOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("./log.txt"));
        SinglecaseDemo06 sw = (SinglecaseDemo06) objectInputStream.readObject();
        System.out.println(sw);
        System.out.println(s);
        System.out.println(ss);

    }
}
