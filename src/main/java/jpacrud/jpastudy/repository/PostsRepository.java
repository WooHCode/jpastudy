package jpacrud.jpastudy.repository;

import jpacrud.jpastudy.entity.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
