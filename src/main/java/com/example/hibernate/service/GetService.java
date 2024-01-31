package com.example.hibernate.service;


import com.example.hibernate.entity.Person;

import java.util.List;

public interface GetService {
    List<Person> getPersonsByCity(String city);
}