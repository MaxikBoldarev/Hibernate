package com.example.hibernate.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor


public class Person {
    @EmbeddedId
    private PersonPrimaryKey personPrimaryKey;
    private String phone_of_number;
    private String city_of_living;
}