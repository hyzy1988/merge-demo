package pl.sda.gitmerge.service;

import org.springframework.stereotype.Service;
import pl.sda.gitmerge.domain.Animal;
import pl.sda.gitmerge.domain.AnimalType;

@Service
public class AnimalService {

    public Animal getAnimal() {
        return Animal.builder()
                .name("Burek")
                .age(9)
                .animalType(AnimalType.MAMMAL)
                .rasa("buldog")
                .size("maly")
                .sex("male")
                .build();
    }
}
