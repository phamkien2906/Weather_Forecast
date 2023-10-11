package com.web.weather_forecast_web;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.web.weather_forecast_web.Model.Condition;
import com.web.weather_forecast_web.Model.Current;
import com.web.weather_forecast_web.Model.Location;
import com.web.weather_forecast_web.Model.WeatherData;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception{
        HttpClient httpClient = HttpClient.newBuilder().build();

        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(new URI("http://api.weatherapi.com/v1/forecast.json?key=e32ead811fa041d4aad213219232809&q=HaNoi&days=7"))
                .build();

        HttpResponse<String> response = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());

        ObjectMapper mapper = new ObjectMapper();
        WeatherData weatherData = mapper.readValue(response.body(), WeatherData.class);
//        List<Post> posts = mapper.readValue(response.body(), new TypeReference<List<Post>>() {});
//        System.out.println(weatherData.getLocation());
//        System.out.println("*********************************");
//        System.out.println(weatherData.getCurrent());
//        System.out.println(weatherData.getForecast().getForecastday().get(0));
        String dateString = "2023-10-06 11:53";
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd ");

        Date date = dateFormat.parse(dateString);

        // In ra thời gian
        System.out.println(date);
    }

}
