package WeatherStation;

public class StatisticsDisplay implements Observer, DisplayElement
{
    private float avg = 0;
    private float min = 1000;
    private float max = 0;
    private Subject weatherStatistic;

    public StatisticsDisplay(Subject weatherStatistic)
    {
        this.weatherStatistic = weatherStatistic;
        weatherStatistic.registerObserver(this);
    }

    public void display()
    {
        System.out.print("Avg/Max/Min temperature = " + avg + "/" + max + "/" + min + "\n");
    }

    @Override
    public void update(float temperature, float humidity, float pressure)
    {
        if (temperature >=max)
        {
            max = temperature;
        }
        if (temperature <= min)
        {
            min = temperature;
        }
        avg = (max+min)/2f;
        display();
    }
}
