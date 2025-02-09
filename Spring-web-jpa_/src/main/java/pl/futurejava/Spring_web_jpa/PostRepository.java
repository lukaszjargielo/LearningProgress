package pl.futurejava.Spring_web_jpa;

import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository <Post, Integer> {
}
