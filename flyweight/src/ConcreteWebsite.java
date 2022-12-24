public class ConcreteWebsite extends Website{

    private String type;

    @Override
    public void use(User user) {
        System.out.println(type + "," + user.getName());
    }

    public ConcreteWebsite(String type) {
        this.type = type;
    }


}
