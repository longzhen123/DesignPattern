import java.util.Iterator;

/**
 * @author LongZhen
 * @date Created in 2023/1/25 10:56
 */


public class ComputerCollegeIterator implements Iterator {

    private Department[] departments;
    private int index;
    private int size;

    public ComputerCollegeIterator(Department[] departments, int size) {
        this.departments = departments;
        this.size = size;
        index = -1;
    }

    @Override
    public boolean hasNext() {
        if(index >= size - 1) {
            return false;
        } else {
            index++;
            return true;
        }
    }

    @Override
    public Object next() {
        return departments[index];
    }
}
