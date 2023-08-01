package ru.netology.hibernate_dao.repository;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import ru.netology.hibernate_dao.domain.Person;

import java.util.List;

@Repository
public class MyRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public List<Person> getPersonsByCity(String city) {
        String script = "select contact from Person where cityOfLiving = :city";
        return entityManager.createQuery(script)
                .setParameter("city", city)
                .getResultList();
    }


}
