package forum.vet.api.Foro.infra.springdoc;


import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfiguration {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components()
                        .addSecuritySchemes("bearer-key",
                                new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT")))
                .info(new Info()
                        .title("Foro.vet API")
                        .description("API Rest de la aplicación Foro.vet, que contiene las publicaciones de veterinarios")
                        .contact(new Contact()
                                .name("Equipo Backend")
                                .email("backend@foro.vet"))
                        .license(new License()
                                .name("Apache 2.0")));
    }
}
