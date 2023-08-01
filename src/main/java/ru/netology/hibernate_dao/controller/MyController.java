package ru.netology.hibernate_dao.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernate_dao.domain.Person;
import ru.netology.hibernate_dao.repository.MyRepository;

import java.util.List;

@RestController
public class MyController {

    private MyRepository myRepository;

    public MyController(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    @GetMapping("/persons/by-city")
    public ResponseEntity<List<Person>> getPersons(@RequestParam("city") String city) {
        return ResponseEntity.ok(myRepository.getPersonsByCity(city));
    }

}
