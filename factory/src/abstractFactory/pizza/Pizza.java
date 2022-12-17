package abstractFactory.pizza;

public abstract class Pizza {
    private String name;

    public Pizza() {
    }

    public abstract void prepare();

    public void setName(String name) {
        this.name = name;
    }

    public void bake() {
        System.out.println(this.name + " bake");
    }

    public void cut() {
        System.out.println(this.name + " cut");
    }

    public void box() {
        System.out.println(this.name + " box");
    }

}
