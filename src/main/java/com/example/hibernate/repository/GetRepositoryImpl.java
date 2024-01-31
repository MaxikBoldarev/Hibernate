package com.example.hibernate.repository;


import com.example.hibernate.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class GetRepositoryImpl implements GetRepository {
    @PersistenceContext
    private EntityManager entityManager;
    private static final String query = "SELECT Person.personPrimaryKey.name from Person p where p.city_of_living = :city";

    @Override
    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery(query).setParameter("city", city).getResultList();
    }
}