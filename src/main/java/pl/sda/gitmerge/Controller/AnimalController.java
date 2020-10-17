package pl.sda.gitmerge.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.gitmerge.domain.Animal;
import pl.sda.gitmerge.service.AnimalService;

@RestController
@RequestMapping("/animal")
@Slf4j
public class AnimalController {

    private  final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }
    @GetMapping("/info")
    public Animal getAnimal(){
      log.info("animal");
      return animalService.getAnimal();
    }
}
