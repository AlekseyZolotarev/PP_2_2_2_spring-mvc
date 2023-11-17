package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsService;

@Controller
public class CarController {
    private final CarsService carsService;
    @Autowired
    public CarController(CarsService carsService) {
        this.carsService = carsService;
    }

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", required = false, defaultValue = "0") Integer count, ModelMap model) {
        if (count == null) count = 0;
        model.addAttribute("car", carsService.getCarsByCount(count));
        return "cars";
    }
}
