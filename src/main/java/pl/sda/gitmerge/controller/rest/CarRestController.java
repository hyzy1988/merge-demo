package pl.sda.gitmerge.controller.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.gitmerge.domain.Car;
import pl.sda.gitmerge.service.CarService;

@RestController
@RequestMapping("/car")
@Slf4j
public class CarRestController {

    private final CarService carService;

    public CarRestController(final CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/car-info")
    public Car carInfo() {
        return carService.getCar();
    }
}
