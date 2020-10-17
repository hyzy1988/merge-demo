package pl.sda.gitmerge.controller.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.gitmerge.domain.Person;
import pl.sda.gitmerge.service.PersonService;

@RestController
@RequestMapping("/person")
@Slf4j
public class PersonRestController {

    private final PersonService personService;

    public PersonRestController(final PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/person-info")
    public Person personInfo() {
        return  personService.getPerson();
    }
}
