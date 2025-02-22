package pl.futurejava.springbootapplication.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.futurejava.springbootapplication.model.Post;
import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    @Query("SELECT p FROM Post p LEFT JOIN fetch p.comment")
    List<Post> findAllPosts(Pageable page);

    List<Post> findByTitleContainingIgnoreCase(String title);
}
