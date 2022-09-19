package com.example.miniprojecthospitalkelompok2.configuration;

import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(info = @Info(title = "hospital", version = "v1"))

// url :http://localhost:8080/swagger-ui.html
public class SwaggerConfig {
    
}
