import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {

        OrganizationComponent university = new University("大学", "大学");

        OrganizationComponent computerCollege = new College("计算机学院", "计算机学院");
        OrganizationComponent inforEngineerCollege = new College("信息工程学院", "信息工程学院");

        computerCollege.add(new Department("计算机技术", "计算机技术"));
        computerCollege.add(new Department("软件工程", "软件工程"));
        computerCollege.add(new Department("网络工程", "网络工程"));

        inforEngineerCollege.add(new Department("电子信息", "电子信息"));

        university.add(computerCollege);
        university.add(inforEngineerCollege);

        university.print();
        computerCollege.print();
        inforEngineerCollege.print();
    }
}
