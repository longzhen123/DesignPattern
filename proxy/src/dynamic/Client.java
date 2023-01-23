package dynamic;

/**
 * @author LongZhen
 * @date Created in 2023/1/20 20:35
 */


public class Client {

    public static void main(String[] args) {
        ITeacher iTeacher = new TeacherDao();

        ProxyFactory proxy = new ProxyFactory(iTeacher);

        ITeacher proxyInstance = (ITeacher) proxy.getProxyInstance();

        proxyInstance.teach();

    }
}
