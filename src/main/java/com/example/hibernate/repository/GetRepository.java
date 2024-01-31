package com.example.hibernate.repository;

import com.example.hibernate.entity.Person;

import java.util.List;

public interface GetRepository {
    List<Person> getPersonsByCity(String city);
}
