package SystemBlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "SystemBlog.model")
public class SystemBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemBlogApplication.class, args);
	}

}
