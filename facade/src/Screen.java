public class Screen {
    private static Screen screen = new Screen();

    public static Screen getInstance() {
        return screen;
    }

    public void open() {
        System.out.println("屏幕 打开");
    }

    public void close() {
        System.out.println("屏幕 关闭");
    }
}
