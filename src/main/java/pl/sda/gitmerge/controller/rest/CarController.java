package pl.sda.gitmerge.controller.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.gitmerge.domain.Car;
import pl.sda.gitmerge.service.CarServis;

@RestController
@RequestMapping("/car")
@Slf4j
public class CarController {
     private final CarServis carServis;


    public CarController(CarServis carServis) {
        this.carServis = carServis;
    }

@GetMapping("car-info")
public Car carInfo(){
        return carServis.getCar();
}
}
