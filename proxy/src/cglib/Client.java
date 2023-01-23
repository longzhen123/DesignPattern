package cglib;

/**
 * @author LongZhen
 * @date Created in 2023/1/20 21:39
 */


public class Client {

    public static void main(String[] args) {

        TeacherDao teacherDao = new TeacherDao();

        ProxyFactory factory = new ProxyFactory(teacherDao);

        TeacherDao proxyInstance = (TeacherDao)factory.getProxyInstance();

        proxyInstance.teach();
    }
}
