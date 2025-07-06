package com.tarea.marcos.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    //Configurar grupo de Api para swagger
    @Bean
    public GroupedOpenApi publicApi(){
        return GroupedOpenApi.builder()
                .group("public")
                .packagesToScan("com.tarea.marcos")//Escanea todos los paquetes para encotrar los controladores
                .pathsToMatch("/**")// Exponer todas las rutas api
                .build();
    }
}
