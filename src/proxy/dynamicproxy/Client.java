package proxy.dynamicproxy;

import proxy.staticproxy.RealStar;
import proxy.staticproxy.Star;

import java.lang.reflect.Proxy;

/**
 * @author:muming
 * @date:2018/12/1 15:17
 * @description:动态代理
 */
public class Client {
    String a;
    public static void main(String[] args) {
        Star realstar = new RealStar();
        StarHandler starHandler = new StarHandler(realstar);
        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, starHandler);
        proxy.bookTicket();
        proxy.sing();
    }
}
