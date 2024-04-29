package ru.easyum.lombok;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@ToString
@SuperBuilder(toBuilder = true)
public class Person {
    private String telephone;
    private String firstName;
    private LocalDate dateOfBirth;
    private String lastName;
    private String address;
}
