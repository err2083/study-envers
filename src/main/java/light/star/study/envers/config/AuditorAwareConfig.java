package light.star.study.envers.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;
import java.util.Random;

@Configuration
@EnableJpaAuditing
public class AuditorAwareConfig {

    @Bean
    public AuditorAware<Long> auditorAware() {
        return () -> {
            int Id = new Random().nextInt(100);
            return Optional.of(Long.valueOf(Id));
        };
    }
}
