package com.web.weather_forecast_web.Controller;

import com.web.weather_forecast_web.Model.WeatherData;
import com.web.weather_forecast_web.Repository.WeatherRepository;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final WeatherRepository repository;

    @GetMapping("current")
    public String homePage(Model model, HttpSession session) {
        WeatherData weatherData = repository.getWeatherData();
//        model.addAttribute("data", weatherData);
        session.setAttribute("data", weatherData);
        model.addAttribute("value", "Celsius");
        return "Current_Weather";
    }

    @RequestMapping(value = "/degree", method = {RequestMethod.PUT, RequestMethod.GET})
    public String homePageWithDegree(@RequestParam(name = "value") String value,
                                     Model model,
                                     HttpSession session) {
        WeatherData weatherData = repository.getWeatherData();
        model.addAttribute("value", value);
        return "Current_Weather";
    }

    @RequestMapping(value = "/view-weather", method = {RequestMethod.GET})
    public String getWeatherByPlace(@RequestParam(name = "place") String place,
                                    Model model,HttpSession session) {
        WeatherData weatherData = repository.getWeatherDataByPlace(place);
        session.setAttribute("data", weatherData);
        model.addAttribute("value", "Celsius");
        return "Current_Weather";
    }

    @RequestMapping(value = "/current-location", method = {RequestMethod.PUT, RequestMethod.GET})
    public String getWeatherByCurentPlace(@RequestParam(name = "q") String q,
                                          Model model,HttpSession session) {
        WeatherData weatherData = repository.getWeatherDataByPlace(q);
        session.setAttribute("data", weatherData);
        model.addAttribute("value", "Celsius");
        return "Current_Weather";
    }

}
