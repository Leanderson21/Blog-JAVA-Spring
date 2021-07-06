package SystemBlog.service;

import java.util.List;

import SystemBlog.model.Post;

public interface CodeblogService {
	
	List<Post> findAll();
	Post findById(Long id);
	Post save(Post post);
	
}
