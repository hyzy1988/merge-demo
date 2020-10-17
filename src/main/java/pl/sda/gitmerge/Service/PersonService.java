package pl.sda.gitmerge.Service;

import org.springframework.stereotype.Service;
import pl.sda.gitmerge.domain.Person;

@Service


public class PersonService {
    public Person getPerson () {
        return Person.builder()
                .name("Piotr")
                .surname("blbbl")
                .age(12)
                .build();

    }
}
