package pl.sda.gitmerge.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;

@Data
@AllArgsConstructor
@Builder
public class Animal {
    private String name;
    private long age;
    private AnimalType animalType;
    private String rasa;
    private String size;
    private String sex;
    private Long weight;
}
