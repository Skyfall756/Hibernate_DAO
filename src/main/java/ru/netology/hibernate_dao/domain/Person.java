package ru.netology.hibernate_dao.domain;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Person {

    @EmbeddedId
    private Contact contact;
    private String phoneNumber;
    private String cityOfLiving;


}
