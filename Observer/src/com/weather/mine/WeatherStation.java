package com.weather.mine;

public class WeatherStation {

	public static void main(String[] args) 
	{
		WeatherData weather_data = new WeatherData();
		CurrentConditions currentconditions = new CurrentConditions(weather_data);
		
		//StatisticsDisplay statisticsdisplay = new StatisticsDisplay(weather_data);
		
		//ForecastDisplay forecastdisplay = new ForecastDisplay(weather_data);
		
		weather_data.setMeasurements(80, 30, 45.9f);
		weather_data.setMeasurements(76, 20, 35.9f);
		weather_data.setMeasurements(43, 10, 25.9f);
		
	}

}
