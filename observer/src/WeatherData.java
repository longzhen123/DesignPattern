import java.util.ArrayList;

/**
 * @author LongZhen
 * @date Created in 2023/1/25 19:39
 */


public class WeatherData implements Subject{
    private float temperature;
    private float pressure;
    private float humidity;
    private ArrayList<Observer> observers;

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public WeatherData(float temperature, float pressure, float humidity) {
        observers = new ArrayList<>();
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("temperature = " + temperature);
        System.out.println("pressure = " + pressure);
        System.out.println("humidity = " + humidity);
    }

    public void dataChange() {

    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(observers.contains(o)) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyAllObserver() {

        for(int i = 0; i < observers.size(); i++) {
            observers.get(i).update(temperature, pressure, humidity);
        }
    }
}
