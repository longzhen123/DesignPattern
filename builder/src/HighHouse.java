public class HighHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("建筑高楼地基");
    }

    @Override
    public void buildWall() {
        System.out.println("建筑高楼墙壁");
    }

    @Override
    public void buildRoof() {
        System.out.println("建筑高楼屋顶");
    }
}
