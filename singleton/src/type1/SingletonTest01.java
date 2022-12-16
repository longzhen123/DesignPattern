package type1;

public class SingletonTest01 {

    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstance();
        SingleTon singleTon1 = SingleTon.getInstance();
        System.out.println(singleTon1 == singleTon);
        System.out.println("hasCode = " + singleTon1);
        System.out.println("hasCode = " + singleTon);

    }
}

// 饿汉式(静态变量)
class SingleTon {

    // 私有化构造方法
    private SingleTon() {

    }

    // 静态成员变量
    private final static SingleTon instance = new SingleTon();

    public static SingleTon getInstance() {
        return instance;
    }
}
