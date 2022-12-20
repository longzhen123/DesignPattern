public class Client {

    public static void main(String[] args) {
        HouseDirector director = new HouseDirector(new CommonHouse());
        director.buildHouse();

        director.setHouseBuilder(new HighHouse());
        director.buildHouse();
    }
}
