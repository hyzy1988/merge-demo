package pl.sda.gitmerge.service;

import org.springframework.stereotype.Service;
import pl.sda.gitmerge.domain.Animal;

@Service
public class AnimalService {

    public Animal getAnimal() {
        return Animal.builder()
                .rasa("buldog")
                .size("maly")
                .sex("male")
                .build();
    }
}
