import java.util.ArrayList;
import java.util.List;

/**
 * @author LongZhen
 * @date Created in 2023/1/25 11:17
 */


public class Client {

    public static void main(String[] args) {

        List<College> collegeList = new ArrayList<>();
        collegeList.add(new ComputerCollege());
        collegeList.add(new InfoCollege());

        OutputImpl output = new OutputImpl(collegeList);
        output.printCollege();
    }
}
