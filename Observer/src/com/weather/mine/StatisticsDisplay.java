package com.weather.mine;

public class StatisticsDisplay implements Observer, DisplayElement  
{
	private float temperature;
	private float humidity;
	private Subject weather_data;

	public StatisticsDisplay(Subject weather_data)
	{
		this.weather_data = weather_data;
		weather_data.registerObserver(this);
	}

	@Override
	public void display() 
	{
		System.out.println("Temperature & humidity = " + temperature + " " + humidity);
	}

	@Override
	public void update(float temperature, float pressure, float humidity) 
	{
		this.temperature = temperature;
		this.humidity = humidity;
		
		display();
	}

}
