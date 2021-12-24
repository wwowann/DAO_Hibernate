//package appdemo;
//
//import entity.Persons;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/")
//public class ControllerApp {
//    private final RepositoryPersons repositoryPersons;
//
//    public ControllerApp(RepositoryPersons repositoryPersons) {
//        this.repositoryPersons = repositoryPersons;
//    }
//    @GetMapping("//persons/by-city")
//    public List<Persons> getPersonsByCity(@RequestParam ("city_of_living") String city){
//        return repositoryPersons.getPersonsByCity(city);
//
//    }}
