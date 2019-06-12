package com.telran.java3h.controller;

import com.telran.java3h.dto.PersonDTO;
import com.telran.java3h.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping(value = "/people/{id}/{city}/{street}")
    public PersonDTO getPerson(@RequestParam(value = "name", required = false) String name,
                               @PathVariable("id") String id,
                               @PathVariable("city") String city,
                               @PathVariable("street") String street) {

        return personService.getPersonDTO(name, city, street);
    }

}

class SingletonExample {

    private static SingletonExample instance;

    private SingletonExample() {
    }

    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }

        return instance;
    }
}