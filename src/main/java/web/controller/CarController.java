package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servise.CarServise;

@Controller
public class CarController {
    private CarServise carServise;

    @Autowired
    public CarController (CarServise carServise){
        this.carServise = carServise;
    }
    @GetMapping("/cars")
    public String getCar (Model model, @RequestParam(value = "count",defaultValue = "5")int count){
        model.addAttribute("cars", carServise.getCountCar(count));
        return "cars";
    }

}
