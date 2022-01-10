package appdemo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class RepositoryClass {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Persons> getPersonsByCity(String city) {
        return entityManager.createQuery("SELECT p FROM persons p WHERE p.city_of_living = :city", Persons.class)
                .setParameter("city", city)
                .getResultList();
    }

}
