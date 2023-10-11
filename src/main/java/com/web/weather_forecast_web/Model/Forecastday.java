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
public class Forecastday {
    @JsonProperty("date")
    private String date;
    @JsonProperty("date_epoch")
    private Integer dateEpoch;
    @JsonProperty("day")
    @Valid
    private Day day;
    @JsonProperty("astro")
    @Valid
    private Astro astro;
    @JsonProperty("hour")
    @Valid
    private List<Hour> hour;

    @Override
    public String toString() {
        return "Forecastday{" +
                "date='" + date + '\'' +
                ", dateEpoch=" + dateEpoch +
                ", day=" + day +
                ", astro=" + astro +
                ", hour=" + hour +
                '}';
    }
}
