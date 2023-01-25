import java.util.Iterator;

public interface College {

    public void addDepartment(String name, String desc);
    public Iterator createIterator();
    public String getName();
}
