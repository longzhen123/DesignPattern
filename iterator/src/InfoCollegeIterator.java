import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author LongZhen
 * @date Created in 2023/1/25 10:59
 */


public class InfoCollegeIterator implements Iterator {

    private List<Department> departments;
    private int index;

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
        index = -1;
    }


    @Override
    public boolean hasNext() {
        if(index >= departments.size() - 1) {
            return false;
        } else {
            index++;
            return true;
        }
    }

    @Override
    public Object next() {
        return departments.get(index);
    }
}
