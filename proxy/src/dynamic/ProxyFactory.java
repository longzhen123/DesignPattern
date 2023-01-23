package dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author LongZhen
 * @date Created in 2023/1/20 20:31
 */


public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (Object proxy, Method method, Object[] args) -> {

                    System.out.println("JDK动态代理...");
                    Object returnVal = method.invoke(target, args);
                    System.out.println("JDK动态代理提交...");
                    return returnVal;
                });
    }
}
