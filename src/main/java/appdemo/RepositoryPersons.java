//package appdemo;
//
//import entity.Persons;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.TypedQuery;
//import java.util.List;
//
//@Repository
//@Transactional
//public class RepositoryPersons {
//        @PersistenceContext
//        private EntityManager entityManager;
//
//        public RepositoryPersons (EntityManager entityManager) {
//            this.entityManager = entityManager;
//        }
//
//        public List<Persons> getPersonsByCity(String city) {
//            TypedQuery<Persons> query = entityManager.createQuery
//                    ("select p from Persons p where p.city_of_living =:city",
//                            Persons.class);
//            query.setParameter("city", city);
//            return query.getResultList();
//        }
//    }
//
