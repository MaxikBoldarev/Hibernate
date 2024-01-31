package com.example.hibernate.repository;

import com.example.hibernate.entity.Person;

import java.util.List;

public interface PersonRepository {
    List<Person> getPersonsByCity(String city);
}
