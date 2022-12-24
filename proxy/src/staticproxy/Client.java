package staticproxy;

public class Client {
    public static void main(String[] args) {

        ITeacherDao teacherDaoProxy = new TeacherDaoProxy(new TeacherDao());
        teacherDaoProxy.teach();
    }
}
