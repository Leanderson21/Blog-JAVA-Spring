package SystemBlog.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import SystemBlog.model.Post;
import SystemBlog.Repository.CodeblogRepository;

@Service //mostra para o spring que essa classe é um bin gerenciado por ele
public class CodeBlogServiceImplement implements CodeblogService {
	
	@Autowired
	CodeblogRepository CodeblogRepository; 

	@Override
	public List<Post> findAll() {
		return CodeblogRepository.findAll();
	}

	@Override
	public Post findById(Long id) {
		return CodeblogRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return CodeblogRepository.save(post);
	}

}
