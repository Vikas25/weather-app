package com.example.weather.web.Response;

import com.example.weather.web.dto.WeatherSummaryDto;

import java.util.List;

public class WeatherSummaryResponse {

    private String status;

    private List<WeatherSummaryDto> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<WeatherSummaryDto> getData() {
        return data;
    }

    public void setData(List<WeatherSummaryDto> data) {
        this.data = data;
    }

    public WeatherSummaryResponse(String status, List<WeatherSummaryDto> data) {
        this.status = status;
        this.data = data;
    }
}
