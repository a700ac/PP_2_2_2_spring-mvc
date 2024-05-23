package web.controller;


import Service.CarServiceImp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import Model.Car;
import java.util.List;


@Controller
public class CarController {
    @GetMapping(value = "/cars")
    private String Cars(@RequestParam(defaultValue = "5") int count, Model model){
        CarServiceImp carServiceImp = new CarServiceImp();
        List<Car> showCar = carServiceImp.getCars(count);
        model.addAttribute("cars", showCar);
        return  "cars";
    }

}
