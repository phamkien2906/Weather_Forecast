package com.web.weather_forecast_web.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Condition {
    private String text;
    private String icon;
    private int code;
    @Override
    public String toString() {
        return "Condition{" +
                "text='" + text + '\'' +
                ", icon='" + icon + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
