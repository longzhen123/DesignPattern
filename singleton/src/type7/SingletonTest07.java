package type7;

public class SingletonTest07 {

    public static void main(String[] args) {
        SingleTon instance1 = SingleTon.getInstance();
        SingleTon instance2 = SingleTon.getInstance();
        System.out.println(instance2 == instance1);
        System.out.println("hasCode == " + instance1);
        System.out.println("hasCode == " + instance2);
    }
}

// 静态内部类
class SingleTon {
    private SingleTon() {}

    private static class SingletonInstance {
        private static final SingleTon INSTANCE = new SingleTon();
    }

    public static SingleTon getInstance() {

        return SingletonInstance.INSTANCE;
    }
}
