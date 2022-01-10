package appdemo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class ControllerClass {
    private final RepositoryClass repository;

    @GetMapping("/by-city")
    public List<Persons> getListPersonByCity(@RequestParam String city_of_living) {
        return repository.getPersonsByCity(city_of_living);
    }
}

