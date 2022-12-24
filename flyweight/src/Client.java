public class Client {
    public static void main(String[] args) {
        WebsiteFactory factory = new WebsiteFactory();

        Website website1 = factory.getWebsite("a");

        Website website2 = factory.getWebsite("b");

        website1.use(new User("x"));
        website1.use(new User("y"));

        website2.use(new User("x"));
        website2.use(new User("y"));

        Website website3 = factory.getWebsite("a");

        System.out.println(website3 == website1);
    }
}
