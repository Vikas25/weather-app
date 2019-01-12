package com.example.weather.web.service.impl;

import com.example.weather.web.converter.WeatherSummaryConverter;
import com.example.weather.web.dao.WeatherSummaryDao;
import com.example.weather.web.dto.WeatherSummaryDto;
import com.example.weather.web.entity.WeatherSummary;
import com.example.weather.web.service.WeatherSummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class WeatherSummaryServiceImpl implements WeatherSummaryService {

    @Autowired
    WeatherSummaryDao weatherSummaryDao;

    @Override
    public List<WeatherSummaryDto> getAllCityWeather() {
        List<WeatherSummary> weatherSummaryList = new ArrayList<>();
        weatherSummaryList = weatherSummaryDao.findAll();
        List<WeatherSummaryDto> weatherSummaryDtoList = new ArrayList<>();
        weatherSummaryDtoList = weatherSummaryList.stream().map(WeatherSummaryConverter::entityToDto).collect(Collectors.toList());
        return weatherSummaryDtoList;
    }

}
