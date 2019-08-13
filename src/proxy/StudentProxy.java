package proxy;

import java.lang.reflect.Proxy;

public class StudentProxy {
    public static Object agent(Class interfaceClazz, Object proxy) {
        return Proxy.newProxyInstance(interfaceClazz.getClassLoader(), new Class[]{interfaceClazz}, new ProxyHandler(proxy));
    }
}
