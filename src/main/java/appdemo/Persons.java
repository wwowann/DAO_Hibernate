package appdemo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "persons")// наименование таблицы
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "persons", schema = "person")// данный атрибут необходим, если нужно указать название
// таблицы, каталог таблицы или название схемы, в которой находится таблица
public class Persons {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;// обязательный атрибут

    @Column(length = 15)
// здесь указывается атрибут, например если имя в талице не соответствует имени переменной в этом классе
    private String name;

    @Column(length = 20)
    private String surname;

    private int age;

    private String city_of_living;

    @Column(length = 7)
    private int phone_number;

}
