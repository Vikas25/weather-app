package com.example.weather.web.controller;

import com.example.weather.web.dto.WeatherSummaryDto;
import com.example.weather.web.service.WeatherSummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/summary")
public class WeatherSummaryController {

	@Autowired
	private WeatherSummaryService weatherSummaryService;

	@RequestMapping("/allcities")
	public List<WeatherSummaryDto> getAllCityWeather() {
		return weatherSummaryService.getAllCityWeather();
	}

}
