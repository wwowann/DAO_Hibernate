package appdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
//@Transactional
public class RepositoryClass {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public RepositoryClass(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    public List<Persons> getPersonsByCity(String city) {
        TypedQuery<Persons> query = entityManager.createQuery
                ("select p from Persons p where p.city_of_living = :city",//здесь ссылаемся не на таблицу persons, а на сущность - экземпляр класса Persons
                        Persons.class);
        query.setParameter("city", city);

        return query.getResultList();
    }

}
