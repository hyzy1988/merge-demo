package pl.sda.gitmerge.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.sda.gitmerge.domain.Car;

@Service
public class CarService {

    public Car getCar() {
        return Car.builder()
            .colour("krwisty czerwony")
            .engineCapacity(20_000)
            .build();
    }
}
