package com.web.weather_forecast_web.Model;

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
public class Day {
    @JsonProperty("maxtemp_c")
    private Double maxtempC;
    @JsonProperty("maxtemp_f")
    private Double maxtempF;
    @JsonProperty("mintemp_c")
    private Double mintempC;
    @JsonProperty("mintemp_f")
    private Double mintempF;
    @JsonProperty("avgtemp_c")
    private Double avgtempC;
    @JsonProperty("avgtemp_f")
    private Double avgtempF;
    @JsonProperty("maxwind_mph")
    private Double maxwindMph;
    @JsonProperty("maxwind_kph")
    private Double maxwindKph;
    @JsonProperty("totalprecip_mm")
    private Double totalprecipMm;
    @JsonProperty("totalprecip_in")
    private Double totalprecipIn;
    @JsonProperty("totalsnow_cm")
    private Double totalsnowCm;
    @JsonProperty("avgvis_km")
    private Double avgvisKm;
    @JsonProperty("avgvis_miles")
    private Double avgvisMiles;
    @JsonProperty("avghumidity")
    private Double avghumidity;
    @JsonProperty("daily_will_it_rain")
    private Integer dailyWillItRain;
    @JsonProperty("daily_chance_of_rain")
    private Integer dailyChanceOfRain;
    @JsonProperty("daily_will_it_snow")
    private Integer dailyWillItSnow;
    @JsonProperty("daily_chance_of_snow")
    private Integer dailyChanceOfSnow;
    @JsonProperty("condition")
    @Valid
    private Condition condition;
    @JsonProperty("uv")
    private Double uv;

    @Override
    public String toString() {
        return "Day{" +
                "maxtempC=" + maxtempC +
                ", maxtempF=" + maxtempF +
                ", mintempC=" + mintempC +
                ", mintempF=" + mintempF +
                ", avgtempC=" + avgtempC +
                ", avgtempF=" + avgtempF +
                ", maxwindMph=" + maxwindMph +
                ", maxwindKph=" + maxwindKph +
                ", totalprecipMm=" + totalprecipMm +
                ", totalprecipIn=" + totalprecipIn +
                ", totalsnowCm=" + totalsnowCm +
                ", avgvisKm=" + avgvisKm +
                ", avgvisMiles=" + avgvisMiles +
                ", avghumidity=" + avghumidity +
                ", dailyWillItRain=" + dailyWillItRain +
                ", dailyChanceOfRain=" + dailyChanceOfRain +
                ", dailyWillItSnow=" + dailyWillItSnow +
                ", dailyChanceOfSnow=" + dailyChanceOfSnow +
                ", condition=" + condition +
                ", uv=" + uv +
                '}';
    }
}
