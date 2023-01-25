import java.util.Iterator;

/**
 * @author LongZhen
 * @date Created in 2023/1/25 11:03
 */


public class ComputerCollege implements College{

    private Department[] departments;
    int numOfDepartment = 0;

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("Java", "Java");
        addDepartment("PHP", "PHP");
    }

    @Override
    public void addDepartment(String name, String desc) {
        departments[numOfDepartment] = new Department(name, desc);
        numOfDepartment++;

    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments, numOfDepartment);
    }

    @Override
    public String getName() {
        return "计算机学院";
    }
}
