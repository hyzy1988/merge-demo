package pl.sda.gitmerge.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
