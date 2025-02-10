package pl.futurejava.Spring_web_jpa.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import pl.futurejava.Spring_web_jpa.entity.User;
import pl.futurejava.Spring_web_jpa.repository.UserRepository;

import java.net.URI;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<User> getUserById(Integer id) {
        return userRepository.findById(id).map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }


    public ResponseEntity<Iterable<User>> getAllUsers() {
        Iterable<User> users = userRepository.findAll();
        return ResponseEntity.ok(users);
    }

    public ResponseEntity<User> createUser(User user) {
        User savedUser = userRepository.save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();

        return ResponseEntity.created(location).body(savedUser);
    }


    public ResponseEntity<User> partiallyUpdateUser(Integer id, User user) {
        return userRepository.findById(id)
                .map(existingUser -> {
                    if (user.getLogin() != null) existingUser.setLogin(user.getLogin());
                    if (user.getDisplayName() != null) existingUser.setDisplayName(user.getDisplayName());
                    if (user.getYearOfBirth() != null) existingUser.setYearOfBirth(user.getYearOfBirth());

                    return userRepository.save(existingUser);
                })
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    public ResponseEntity<User> updateUser(Integer id, User user) {
        return userRepository.findById(id)
                .map(existingUser -> {
                    existingUser.setLogin(user.getLogin());
                    existingUser.setDisplayName(user.getDisplayName());
                    existingUser.setYearOfBirth(user.getYearOfBirth());

                    return userRepository.save(existingUser);
                })
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    public ResponseEntity<Void> deleteUser(Integer id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
