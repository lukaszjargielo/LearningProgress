package pl.futurejava.Spring_web_jpa.repository;

import org.springframework.data.repository.CrudRepository;
import pl.futurejava.Spring_web_jpa.entity.Post;

public interface PostRepository extends CrudRepository <Post, Integer> {
}
