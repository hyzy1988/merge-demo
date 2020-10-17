package pl.sda.gitmerge.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.sda.gitmerge.domain.Person;

@Service
@Slf4j
public class PersonService {

    public Person getPerson() {
        return Person.builder()

                .firstName("Jan")
                .lastName("Kowalski")
                .address("Ul. Krzywa 13")
                .build();

    }
}
