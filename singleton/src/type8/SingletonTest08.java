package type8;

public class SingletonTest08 {
    public static void main(String[] args) {
        SingleTon instance = SingleTon.INSTANCE;
        SingleTon instance1 = SingleTon.INSTANCE;
        System.out.println(instance1 == instance);
        instance.sayOk();
        instance1.sayOk();
        System.out.println(instance1.hashCode());
        System.out.println(instance.hashCode());

        instance.say("askj");
    }
}

enum SingleTon {
    INSTANCE;

    public void sayOk() {
        System.out.println("OK");
    }

    public void say(String s) {
        System.out.println(s);
    }
}
