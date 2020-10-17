package pl.sda.gitmerge.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.sda.gitmerge.domain.Animal;
import pl.sda.gitmerge.domain.AnimalType;

@Service
@Slf4j
public class AnimalService {
    private final Animal animal;

    public AnimalService(Animal animal) {
        this.animal = animal;
    }

    public void creatAnimal(Animal animal){
        animal.builder()
                .name(animal.getName())
                .age(animal.getAge())
                .animalType(animal.getAnimalType())
                .build();
    }
    public Animal getAnimal(){
        return animal.builder()
                .name("Burek")
                .age(9)
                .animalType(AnimalType.MAMMAL)
                .build();
    }

}
