package com.web.weather_forecast_web.Repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.web.weather_forecast_web.Model.WeatherData;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
public class WeatherRepository {
    public WeatherData getWeatherData() {
        try {
            HttpClient httpClient = HttpClient.newBuilder().build();

            HttpRequest getRequest = HttpRequest.newBuilder()
                    .uri(new URI("http://api.weatherapi.com/v1/forecast.json?key=e32ead811fa041d4aad213219232809&q=HaNoi&days=7"))
                    .build();

            HttpResponse<String> response = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());

            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(response.body(), WeatherData.class);
        } catch (Exception ex) {
            System.out.println( ex );
            return null ;
        }
    }

    public WeatherData getWeatherDataByPlace(String place){
        try {
            String uri ="http://api.weatherapi.com/v1/forecast.json?key=e32ead811fa041d4aad213219232809&q=";
            uri+= place+"&days=7";
            HttpClient httpClient = HttpClient.newBuilder().build();

            HttpRequest getRequest = HttpRequest.newBuilder()
                    .uri(new URI(uri))
                    .build();

            HttpResponse<String> response = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());

            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(response.body(), WeatherData.class);
        }catch (Exception e){
            System.out.println( e );
        }
        return null ;
    }
}
