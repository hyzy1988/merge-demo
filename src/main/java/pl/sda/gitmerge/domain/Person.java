package pl.sda.gitmerge.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Person {
    private String firstName;
    private String lastName;


}
