package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"service","springboot.controller"})
@EnableJpaRepositories("repository")
@EntityScan("entity")
public class MmWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MmWebApplication.class, args);
	}

}
