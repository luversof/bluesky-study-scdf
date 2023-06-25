package io.github.luversof.scdf.sink.data.jpa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "io.github.luversof.scdf.sink.data.jpa.repository")
public class DataJpaConfig {


}
