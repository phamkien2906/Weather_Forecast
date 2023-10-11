package com.web.weather_forecast_web.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Current {
    private long last_updated_epoch;
    private String last_updated;
    private float temp_c;
    private float temp_f;
    private int is_day;
    private Condition condition;
    private float wind_mph;
    private float wind_kph;
    private int wind_degree;
    private String wind_dir;
    private float pressure_mb;
    private float pressure_in;
    private float precip_mm;
    private float precip_in;
    private int humidity;
    private int cloud;
    private float feelslike_c;
    private float feelslike_f;
    private float vis_km;
    private float vis_miles;
    private float uv;
    private float gust_mph;
    private float gust_kph;

    @Override
    public String toString() {
        return "Current{" +
                "last_updated='" + last_updated + '\'' +
                ", temp_c=" + temp_c +
                ", temp_f=" + temp_f +
                ", is_day=" + is_day +
                ", condition=" + condition +
                ", humidity=" + humidity +
                ", cloud=" + cloud +
                ", feelslike_c=" + feelslike_c +
                ", vis_km=" + vis_km +
                '}';
    }
}
