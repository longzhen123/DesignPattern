import java.util.LinkedList;
import java.util.List;

/**
 * @author LongZhen
 * @date Created in 2023/1/24 16:08
 */


public class ObjectStructure {

    List<Person> people = new LinkedList<>();

    public void attach(Person p) {
        people.add(p);
    }

    public void detach(Person p) {
        people.remove(p);
    }

    public void display(Action action) {
        for(Person p: people) {
            p.accept(action);
        }
    }
}
