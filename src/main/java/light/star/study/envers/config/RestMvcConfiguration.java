package light.star.study.envers.config;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Component
public class RestMvcConfiguration implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.setBasePath("/api"); // 기본 URL 변경
        config.setReturnBodyOnCreate(true); // 엔티티 생성시 본문 반환 여부
        config.setReturnBodyOnUpdate(true); // 엔티티 변경시 본문 반환 여
    }
}
