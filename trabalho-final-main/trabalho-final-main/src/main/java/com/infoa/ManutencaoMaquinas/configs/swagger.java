package com.infoa.ManutencaoMaquinas.configs;

import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;


@Configuration
@OpenAPIDefinition(
    info = @Info (
        title = "Sistema MVC",
        version = "1.0",
        description = "Sistema MVC"
    )
)
public class swagger {
    
}