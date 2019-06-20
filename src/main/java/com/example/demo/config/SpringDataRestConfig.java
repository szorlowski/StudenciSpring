package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class SpringDataRestConfig {

    @Bean
    public RepositoryRestConfigurer repositoryRestConfigurer() {
        return new RepositoryRestConfigurer() {
            @Override
            public void configureRepositoryRestConfiguration(final RepositoryRestConfiguration config) {
                config.setBasePath("/api");
            }
        };
    }
}
