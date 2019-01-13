package com.example.weather.web.controller;

import com.example.weather.integration.ows.WeatherForecast;
import com.example.weather.web.dto.WeatherSummaryDto;
import com.example.weather.web.service.WeatherApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
public class WeatherApiController {

	@Autowired
	WeatherApiService weatherApiService;

	@RequestMapping("/now/{country}/{city}")
	public WeatherSummaryDto getWeather(@PathVariable String country,
										@PathVariable String city) {
		return weatherApiService.getWeather(country, city);
	}

	@RequestMapping("/weekly/{country}/{city}")
	public WeatherForecast getWeatherForecast(@PathVariable String country,
			@PathVariable String city) {
		return weatherApiService.getWeatherForecast(country, city);
	}

	@RequestMapping(value = "/city/{id}",method = RequestMethod.DELETE)
	public void deleteById(@PathVariable Integer id){
		weatherApiService.deleteWeatherSummary(id);
	}

}
