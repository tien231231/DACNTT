package WeatherStation;

public class CurrentConditionDisplay implements Observer, DisplayElement
{
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display()
    {
        System.out.print("Current conditions: " + temperature + "C degrees and " + humidity + "% humidity\n");
    }

    @Override
    public void update(float temperature, float humidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
