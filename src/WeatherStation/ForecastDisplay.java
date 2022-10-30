package WeatherStation;

public class ForecastDisplay implements Observer, DisplayElement
{
    private String f;
    private Subject weatherForecast;

    public ForecastDisplay(Subject weatherForecast)
    {
        this.weatherForecast = weatherForecast;
        weatherForecast.registerObserver(this);
    }
    @Override
    public void update(float temperature, float humidity, float pressure)
    {

        if (temperature > 25 && temperature < 27 && humidity <= 65)
        {
            f = "Improving weather on the day!\n";
        }
        if (temperature >= 27 && humidity > 65 && humidity < 90)
        {
            f = "Watch out for cooler, rainy weather\n";
        }
        if (temperature <= 25 && humidity >= 90)
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
