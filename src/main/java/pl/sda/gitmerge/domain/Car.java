package pl.sda.gitmerge.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Slf4j


public class Car {
    private String model;
    private String color;
    private int engineCapacityInCC;
    private int DMCINKg;
    private String BodyType;
    private boolean OutOfOrder;
}
