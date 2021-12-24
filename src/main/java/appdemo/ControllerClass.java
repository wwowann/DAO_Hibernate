package appdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/")
public class ControllerClass {
    private final RepositoryClass repository;

    public ControllerClass(RepositoryClass repository) {
        this.repository = repository;
    }

    @GetMapping("/persons/by-city")
    public List getListPersonByCity(@RequestParam("city_of_living") String city_name){
        return repository.getPersonsByCity(city_name);
    }
}

