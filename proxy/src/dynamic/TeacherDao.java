package dynamic;

/**
 * @author LongZhen
 * @date Created in 2023/1/20 20:30
 */


public class TeacherDao implements ITeacher{
    @Override
    public void teach() {
        System.out.println("老师授课中");
    }
}
