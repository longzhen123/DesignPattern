import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author LongZhen
 * @date Created in 2023/1/25 11:08
 */


public class InfoCollege implements College{

    private List<Department> departments;
    int numOfDepartments = 0;

    public InfoCollege() {
        departments = new ArrayList<>();
        addDepartment("信息安全专业", "信息安全专业");
        addDepartment("网络安全专业", "网络安全专业");
    }

    @Override
    public void addDepartment(String name, String desc) {
        departments.add(new Department(name, desc));
        numOfDepartments++;
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departments);
    }

    @Override
    public String getName() {
        return "信息学院";
    }
}
