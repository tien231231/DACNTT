package WeatherStation;

public class ForecastDisplay implements Observer, DisplayElement
{
    private String f;
    private float t;
    private Subject weatherForecast;

    public ForecastDisplay(Subject weatherForecast)
    {
        this.weatherForecast = weatherForecast;
        weatherForecast.registerObserver(this);
    }
    @Override
    public void update(float temperature, float humidity, float pressure)
    {
        t = temperature*1.8f + 32;
        if (t > 78 && t < 82 && humidity <= 65)
        {
            f = "Improving weather on the day!\n";
        }
        if (t >= 82 && humidity > 65 && humidity < 90)
        {
            f = "Watch out for cooler, rainy weather\n";
        }
        if (t <= 78 && humidity >= 90)
        {
            f = "More of the same\n";
        }
        display();
    }

    public void display()
    {
        System.out.print("Forecast: " + f);
    }
}
