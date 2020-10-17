package pl.sda.gitmerge.Controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sda.gitmerge.domain.Animal;
import pl.sda.gitmerge.service.AnimalService;


@Slf4j
@RestController
@RequestMapping("/animal")
public class AnimalRestController {

    public final AnimalService animalService;

    public AnimalRestController(final AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/animal-info")
    public Animal animalInfo() {
        return animalService.getAnimal();
    }
}
