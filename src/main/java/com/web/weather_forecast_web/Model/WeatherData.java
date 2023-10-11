package com.web.weather_forecast_web.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@JsonIgnoreProperties({"forecast"})
public class WeatherData {
    @JsonProperty("location")
    @Valid
    private Location location;
    @JsonProperty("current")
    @Valid
    private Current current;
    @JsonProperty("forecast")
    @Valid
    private Forecast forecast;
}
