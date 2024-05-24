package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import web.model.Car;
import web.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;


@Controller
public class CarController {

    @Autowired
    private CarService carService;
    @GetMapping(value = "/cars")
    private String Cars(@RequestParam(defaultValue = "5") int count, Model model){

        List<Car> showCar = carService.getCars(count);
        model.addAttribute("cars", showCar);
        return  "cars";
    }
}
