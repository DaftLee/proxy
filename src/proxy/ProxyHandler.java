package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {
    private Object proxy;

    public ProxyHandler(Object proxy) {
        this.proxy = proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("上课。。。");
        Object resltObject = method.invoke(this.proxy, args);
        System.out.println("下课。。。");
        return resltObject;
    }
}
