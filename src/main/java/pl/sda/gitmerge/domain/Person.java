package pl.sda.gitmerge.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor

public class Person {

    private String firstName;
    private String lastName;
    private String address;
    private int age;

}
