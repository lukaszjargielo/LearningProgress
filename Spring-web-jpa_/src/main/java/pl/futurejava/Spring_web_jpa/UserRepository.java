package pl.futurejava.Spring_web_jpa;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer > {
}
