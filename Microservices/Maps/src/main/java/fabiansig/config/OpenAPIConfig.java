package fabiansig.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI routingServiceAPI() {
        return new OpenAPI()
                .info(new Info().title("Routing Service API")
                        .description("A microservice that calls the google maps api to get the best route between two points.")
                        .version("v0.0.1"));
    }

}
