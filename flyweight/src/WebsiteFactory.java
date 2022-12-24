import java.util.HashMap;
import java.util.Map;

public class WebsiteFactory {

    Map<String, Website> pool = new HashMap<>();

    public WebsiteFactory() {
    }

    public Website getWebsite(String type) {
        if(!pool.containsKey(type)) {
            Website website = new ConcreteWebsite(type);
            pool.put(type, website);
            return website;
        } else {
            return pool.get(type);
        }
    }
}
