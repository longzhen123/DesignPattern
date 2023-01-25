/**
 * @author LongZhen
 * @date Created in 2023/1/25 19:50
 */


public class Client {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditions currentConditions = new CurrentConditions();

        weatherData.setData(10f, 12f, 14f);

        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(new BaiduSite());

        weatherData.notifyAllObserver();

        weatherData.setData(2f, 22f, 22f);
        weatherData.notifyAllObserver();
    }
}
