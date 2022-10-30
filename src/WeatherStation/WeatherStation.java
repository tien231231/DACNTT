package WeatherStation;

public class WeatherStation
{
    public static void main(String[] args)
    {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);


        weatherData.setMeasurements(26, 65, 30);
        weatherData.setMeasurements(27, 70, 29);
        weatherData.setMeasurements(24, 90, 29);


        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(16, 90, 28);


    }
}
