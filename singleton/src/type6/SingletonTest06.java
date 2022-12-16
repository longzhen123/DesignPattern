package type6;

public class SingletonTest06 {

    public static void main(String[] args) {
        SingleTon instance1 = SingleTon.getInstance();
        SingleTon instance2 = SingleTon.getInstance();
        System.out.println(instance2 == instance1);
        System.out.println("hasCode == " + instance1);
        System.out.println("hasCode == " + instance2);
    }
}

// 懒汉式(双重检查)
class SingleTon {
    private SingleTon() {}

    private static volatile SingleTon instance;

    public static SingleTon getInstance() {
        if(null == instance) {

            synchronized (SingleTon.class) {

                if(null == instance) {
                    instance = new SingleTon();
                }

            }

        }
        return instance;
    }
}
