package com.web.weather_forecast_web.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Forecast {
    @JsonProperty("forecastday")
    @Valid
    private List<Forecastday> forecastday;

}
