package interfaceadapter;

public class Client {
    public static void main(String[] args) {
        AbsAdapter adapter = new AbsAdapter() {
            @Override
            public void m2() {
                System.out.println("调用了m2方法");
            }
        };

        adapter.m2();
    }
}
