package com.example.weather.web.controller;

import com.example.weather.web.Response.WeatherSummaryResponse;
import com.example.weather.web.dto.WeatherSummaryDto;
import com.example.weather.web.service.WeatherSummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/summary")
public class WeatherSummaryController {

	@Autowired
	WeatherSummaryService weatherSummaryService;

	@RequestMapping("/allcities")
	public WeatherSummaryResponse getAllCityWeather() {
		List<WeatherSummaryDto> weatherSummaryDtoList = new ArrayList<>();
		weatherSummaryDtoList = weatherSummaryService.getAllCityWeather();
		WeatherSummaryResponse weatherSummaryResponse = new WeatherSummaryResponse("SUCCESS",weatherSummaryDtoList);
		return weatherSummaryResponse;
	}
}
