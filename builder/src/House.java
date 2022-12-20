public class House {
    private String wall;
    private String roof;
    private String basic;

    public House() {
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public House(String wall, String roof, String basic) {
        this.wall = wall;
        this.roof = roof;
        this.basic = basic;
    }
}
