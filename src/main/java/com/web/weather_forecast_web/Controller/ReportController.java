package com.web.weather_forecast_web.Controller;

import com.web.weather_forecast_web.Repository.WeatherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ReportController {
    private final WeatherRepository repository;

    @GetMapping("/report-weather")
    public String reportWeather(){
        return "Report_Weather";
    }
}
