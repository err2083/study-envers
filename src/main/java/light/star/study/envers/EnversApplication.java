package light.star.study.envers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.envers.repository.config.EnableEnversRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableEnversRepositories
@SpringBootApplication
public class EnversApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnversApplication.class, args);
    }

}
