package com.example.hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "PERSONS")

public class Person {
    @EmbeddedId
    private PersonId personId;

    @Column(name = "phone_number")
    private String phone_number;
    @Column(name = "city_of_living")
    private String city_of_living;
}