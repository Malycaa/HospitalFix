package com.example.miniprojecthospitalkelompok2.configuration;

import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Hospital API", version = "v1"))
//@SecurityScheme(
//    name = "Authorization",
//    type = SecuritySchemeType.HTTP,
//    bearerFormat = "JWT",
//    scheme = "bearer"
//)
public class SwaggerConfig {
    
}
