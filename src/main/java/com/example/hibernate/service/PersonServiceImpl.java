package com.example.hibernate.service;

import com.example.hibernate.entity.Person;
import com.example.hibernate.repository.PersonRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {
    public final PersonRepositoryImpl repository;

    @Override
    public List<Person> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }
}
