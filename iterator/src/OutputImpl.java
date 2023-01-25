import java.util.Iterator;
import java.util.List;

/**
 * @author LongZhen
 * @date Created in 2023/1/25 11:12
 */


public class OutputImpl {
    private List<College> collegeList;

    public OutputImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    public void printCollege() {
        Iterator iterator = collegeList.iterator();

        while(iterator.hasNext()) {
            College college = (College) iterator.next();
            System.out.println(college.getName());
            printDepartment(college.createIterator());
        }
    }

    public void printDepartment(Iterator iterator) {

        while(iterator.hasNext()) {
            Department d = (Department) iterator.next();
            System.out.println(d);
        }
    }
}
