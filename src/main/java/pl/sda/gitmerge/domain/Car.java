package pl.sda.gitmerge.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Car {
    private String colour;
    private int engineCapacity;
}
