package com.example.weather.web.dto;

import com.example.weather.integration.ows.Weather;

public class WeatherSummaryDto {

    private String country;

    private String city;

    private Weather weather;

    public WeatherSummaryDto(String country, String city, Weather weather) {
        this.country = country;
        this.city = city;
        this.weather = weather;
    }

    public WeatherSummaryDto(){

    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return this.country;
    }

    public String getCity() {
        return this.city;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public String getFahrenheitTemperature() {
        double fahrenheitTemp = (this.weather.getTemperature() * 1.8) - 459.67;
        return String.format("%4.2f", fahrenheitTemp);
    }

    public String getCelsiusTemperature() {
        double celsiusTemp = this.weather.getTemperature() - 273.15;
        return String.format("%4.2f", celsiusTemp);
    }

    @Override
    public String toString() {
        return "WeatherSummaryDto{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", weather=" + weather +
                '}';
    }
}
