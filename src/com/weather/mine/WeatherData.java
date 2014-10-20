package com.weather.mine;

import java.util.ArrayList;

public class WeatherData implements Subject
{
	private ArrayList<Observer> observers;
	private float temperature;
	private float pressure;
	private float humidity;
	private boolean isChanged = false;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public WeatherData()
	{
		observers = new ArrayList();
	}
	
	@Override
	public void registerObserver(Observer o) 
	{
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) 
	{
		int i = observers.indexOf(o);
		if(i >= 0)
			observers.remove(i);
	}

	@Override
	public void notifyObservers() 
	{
		if(isChanged == true)
		{
			for(int i=0;i<observers.size();i++)
			{
				observers.get(i).update(temperature, pressure, humidity);
			}
			isChanged = false;
		}
	}
	
	public void measurementsChanged()
	{
		isChanged = true;
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float pressure, float humidity)
	{
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		measurementsChanged();
	}
	
}
