package ge.ucha.myApBootDockerApp;

import ge.ucha.myApBootDockerApp.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    @RequestMapping(path = "/hello/{name}")
    public String getUsers(@PathVariable("name") String name) {
        return "hello " + name;
    }

    @GetMapping(path = "/all")
    public List<User> getUsers() {
        List<User> list = new ArrayList<>();
        list.add(new User(1, "Ucha", "Chaduneli123"));
        list.add(new User(2, "ვინმე", "ვინმეს გვარი"));
        list.add(new User(3, "ვინმე", "ვინმეს გვარი"));
        return list;
    }
}
