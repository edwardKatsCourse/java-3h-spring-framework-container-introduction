package com.telran.java3h.service;

import com.telran.java3h.dto.PersonDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

        @Value("${default.name}")
        private String defaultName; //field.set("John", personServiceInstance);

        @Value("${default.city}")
        private String defaultCity;

        @Value("${default.street}")
        private String defaultStreet;


    public PersonDTO getPersonDTO(
            String name,
            String city,
            String street) {

        String personName = name == null || name.isEmpty() ? defaultName : name;
        String personCity = city == null || city.isEmpty() ? defaultCity : city;
        String personStreet = street == null || street.isEmpty() ? defaultStreet : street;

        return PersonDTO.builder()
                .children(0)
                .phoneNumber("123123123")
                .name(personName)
                .city(personCity)
                .street(personStreet)
                .build();
    }
}
