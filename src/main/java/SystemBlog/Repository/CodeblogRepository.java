package SystemBlog.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SystemBlog.model.Post;

public interface CodeblogRepository extends JpaRepository<Post, Long>{

}
