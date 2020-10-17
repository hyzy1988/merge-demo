package pl.sda.gitmerge.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.sda.gitmerge.domain.Car;

@Service
public class CarService {

    public Car getCar() {
        return Car.builder()
                .BodyType("sedan")
                .color("blue")
                .DMCINKg(1400)
                .engineCapacity(2000)
                .model("Honda")
                .OutOfOrder(false)
                .build();
    }
}
