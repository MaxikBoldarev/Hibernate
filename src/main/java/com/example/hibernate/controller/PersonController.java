package com.example.hibernate.controller;

import com.example.hibernate.entity.Person;
import com.example.hibernate.service.PersonServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonController {
    public final PersonServiceImpl service;

    @GetMapping("/by-city")
    public List<Person> getPersonsByCity(@RequestParam(value = "city") String city) {
        return service.getPersonsByCity(city);
    }

}