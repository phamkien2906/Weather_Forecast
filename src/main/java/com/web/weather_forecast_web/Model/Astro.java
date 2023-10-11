package com.web.weather_forecast_web.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Astro {
    @JsonProperty("sunrise")
    private String sunrise;
    @JsonProperty("sunset")
    private String sunset;
    @JsonProperty("moonrise")
    private String moonrise;
    @JsonProperty("moonset")
    private String moonset;
    @JsonProperty("moon_phase")
    private String moonPhase;
    @JsonProperty("moon_illumination")
    private String moonIllumination;
    @JsonProperty("is_moon_up")
    private Integer isMoonUp;
    @JsonProperty("is_sun_up")
    private Integer isSunUp;

    @Override
    public String toString() {
        return "Astro{" +
                "sunrise='" + sunrise + '\'' +
                ", sunset='" + sunset + '\'' +
                ", moonrise='" + moonrise + '\'' +
                ", moonset='" + moonset + '\'' +
                ", moonPhase='" + moonPhase + '\'' +
                ", moonIllumination='" + moonIllumination + '\'' +
                ", isMoonUp=" + isMoonUp +
                ", isSunUp=" + isSunUp +
                '}';
    }
}
