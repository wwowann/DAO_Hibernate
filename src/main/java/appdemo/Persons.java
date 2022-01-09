package appdemo;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
@Data
@Builder
@Entity
@Table(name = "persons", schema = "person")// данный атрибут необходим, если нужно указать название
// таблицы, каталог таблицы или название схемы, в которой находится таблица
public class Persons {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;// обязательный атрибут

    @Column(length = 15)// здесь указывается атрибут, например если имя в талице не соответствует имени переменной в этом классе
    private String name;

    @Column(length = 20)
    private String surname;

    private int age;

    private String city_of_living;

    @Column(length = 7)
    private int phone_number;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Persons persons = (Persons) o;
        return false;
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
