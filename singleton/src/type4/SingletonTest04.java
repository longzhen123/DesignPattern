package type4;

public class SingletonTest04 {

    public static void main(String[] args) {
        SingleTon instance1 = SingleTon.getInstance();
        SingleTon instance2 = SingleTon.getInstance();
        System.out.println(instance2 == instance1);
        System.out.println("hasCode == " + instance1);
        System.out.println("hasCode == " + instance2);
    }
}

// 懒汉式(线程安全)
class SingleTon {
    private SingleTon() {}

    private static SingleTon instance;

    public synchronized static SingleTon getInstance() {
        if(null == instance) {
            instance = new SingleTon();
        }
        return instance;
    }
}
