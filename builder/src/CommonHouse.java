public class CommonHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("建筑普通房子地基");
    }

    @Override
    public void buildWall() {
        System.out.println("建筑普通房子墙壁");
    }

    @Override
    public void buildRoof() {
        System.out.println("建筑普通房子屋顶");
    }
}
