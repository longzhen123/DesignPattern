public class DVDPlayer {

    private static DVDPlayer dvdPlayer = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return dvdPlayer;
    }

    public void open() {
        System.out.println("DVD 打开");
    }

    public void player() {
        System.out.println("DVD 播放");
    }

    public void close() {
        System.out.println("DVD 关闭");
    }
}
