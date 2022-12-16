public class SingletonTest01 {

    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstance();
        SingleTon singleTon1 = SingleTon.getInstance();
        System.out.println(singleTon1 == singleTon);

    }
}

// 饿汉式
class SingleTon {

    private SingleTon() {

    }

    private static SingleTon instance = new SingleTon();

    public static SingleTon getInstance() {
        return instance;
    }
}
