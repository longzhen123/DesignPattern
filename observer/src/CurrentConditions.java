import java.util.Objects;

/**
 * @author LongZhen
 * @date Created in 2023/1/25 19:48
 */


public class CurrentConditions implements Observer{
    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("CurrentConditions");
        System.out.println("temperature = " + temperature);
        System.out.println("pressure = " + pressure);
        System.out.println("humidity = " + humidity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrentConditions that = (CurrentConditions) o;
        return Float.compare(that.temperature, temperature) == 0 && Float.compare(that.pressure, pressure) == 0 && Float.compare(that.humidity, humidity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(temperature, pressure, humidity);
    }
}
