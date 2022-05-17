package jaimedev.com.workshopmongo.resources;

import jaimedev.com.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity <List<User>> findAll() {
        User thais = new User("1", "Thais Silva", "thais@gmail.com");
        User james = new User("2", "James Dev", "jaime@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(thais, james));
        return ResponseEntity.ok().body(list);
    }
}
