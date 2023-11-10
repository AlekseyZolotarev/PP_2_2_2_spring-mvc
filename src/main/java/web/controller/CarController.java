package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsService;
import web.service.CarsServiceImp;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        CarsService carsService = new CarsServiceImp();
        if (count == null) count = 0;
        model.addAttribute("car", carsService.printCars(count));
        return "cars";
    }
}
