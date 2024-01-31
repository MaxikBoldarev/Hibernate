package com.example.hibernate.service;

import com.example.hibernate.entity.Person;
import com.example.hibernate.repository.GetRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class GetServiceImpl implements GetService{
    public final GetRepositoryImpl repository;

    @Override
    public List<Person> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }
}
