package proxy.dynamicproxy;

import proxy.staticproxy.Star;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author:muming
 * @date:2018/12/1 15:13
 * @description:
 */
public class StarHandler implements InvocationHandler {
    Star realstar;

    public StarHandler(Star realstar) {
        this.realstar = realstar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object object = null;
        if (method.getName().equals("sing")) {

            object = method.invoke(realstar, args);
        }

        return object;
    }
}
