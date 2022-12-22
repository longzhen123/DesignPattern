public class Client {

    private DVDPlayer dvdPlayer;
    private Screen screen;

    public Client() {
        dvdPlayer = DVDPlayer.getInstance();
        screen = Screen.getInstance();
    }

    public void ready() {
        screen.open();
        dvdPlayer.open();
    }

    public void player() {
        dvdPlayer.player();
    }

    public void end() {
        dvdPlayer.close();
        screen.close();
    }

    public static void main(String[] args) {

        Client client = new Client();
        client.ready();
        System.out.println("==============");
        client.player();
        System.out.println("==============");
        client.end();
    }
}
