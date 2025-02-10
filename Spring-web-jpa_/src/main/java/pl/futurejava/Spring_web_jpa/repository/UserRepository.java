package pl.futurejava.Spring_web_jpa.repository;

import org.springframework.data.repository.CrudRepository;
import pl.futurejava.Spring_web_jpa.entity.User;

public interface UserRepository extends CrudRepository<User, Integer > {
}
