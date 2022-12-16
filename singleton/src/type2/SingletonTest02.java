package type2;

public class SingletonTest02 {

    public static void main(String[] args) {
        SingleTon2 singleTon = SingleTon2.getInstance();
        SingleTon2 singleTon1 = SingleTon2.getInstance();
        System.out.println(singleTon1 == singleTon);
        System.out.println("hasCode = " + singleTon1);
        System.out.println("hasCode = " + singleTon);

    }
}

// 饿汉式(静态代码块)
class SingleTon2 {

    // 私有化构造方法
    private SingleTon2() {

    }

    // 静态成员变量
    private static SingleTon2 instance;

    static {
        instance = new SingleTon2();
    }

    public static SingleTon2 getInstance() {
        return instance;
    }
}