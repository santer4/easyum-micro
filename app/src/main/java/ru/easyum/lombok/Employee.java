package ru.easyum.lombok;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@ToString(callSuper = true)
@SuperBuilder(toBuilder = true)
public class Employee extends Person {
    String companyName;
    String position;
}
