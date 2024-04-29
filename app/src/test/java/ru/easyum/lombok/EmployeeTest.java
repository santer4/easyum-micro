package ru.easyum.lombok;

import lombok.SneakyThrows;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.time.LocalDate;
import java.time.Month;

import static jdk.dynalink.linker.support.Guards.isNotNull;
import static org.hamcrest.MatcherAssert.assertThat;


public class EmployeeTest {

    @Test
    @SneakyThrows
    @DisplayName("Lombok demonstration")
    public void firstExampleWorksCorrectlyTest() {
        Employee vasja = Employee.builder()
                .firstName("Vasja")
                .lastName("Vasin")
                .dateOfBirth(LocalDate.of(1993, Month.JULY, 25))
                .address("Мск, Ленина, 1")
                .companyName("CoolCompany")
                .position("Senior Developer")
                .build();

        Employee vasjaOld = vasja.toBuilder()
                .companyName("XYZ Inc.")
                .position("Lead Developer")
                .build();
        System.out.println(vasjaOld);

        //todo after lesson test
//        assertThat(vasjaOld).isNotNull()
//                .isExactlyInstanceOf(Employee.class)
//                .matches());

    }
}
