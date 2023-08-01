package ru.netology.hibernate_dao.domain;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Contact implements Serializable {
    private String name;
    private String surname;
    private int age;
}
