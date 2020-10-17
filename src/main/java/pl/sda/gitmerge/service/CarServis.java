package pl.sda.gitmerge.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.sda.gitmerge.domain.Car;

@Service
@Slf4j
public class CarServis {
    public Car getCar(){
        return Car.builder()
                .BodyType("sedan")
                .color("blue")
                .DMCINKg(1400)
                .engineCapacityInCC(2000)
                .model("Honda")
                .OutOfOrder(false)
                .build();

    }
}
