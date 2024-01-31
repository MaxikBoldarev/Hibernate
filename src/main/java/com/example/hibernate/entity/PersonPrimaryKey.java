package com.example.hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;


import java.io.Serializable;

@Data
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class PersonPrimaryKey implements Serializable {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String surname;
    @Column(nullable = false)
    private int age;

}