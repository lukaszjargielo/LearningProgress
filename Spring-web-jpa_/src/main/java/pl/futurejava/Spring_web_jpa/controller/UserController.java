package pl.futurejava.Spring_web_jpa.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.futurejava.Spring_web_jpa.entity.User;
import pl.futurejava.Spring_web_jpa.service.UserService;

@RestController
@RequestMapping("users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<Iterable<User>> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Integer id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<User> updateUserPartially(@PathVariable Integer id, @RequestBody User user) {
        return userService.partiallyUpdateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id) {
        return userService.deleteUser(id);
    }

}


