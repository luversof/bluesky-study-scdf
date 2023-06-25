package io.github.luversof.scdf.source.http.config;

import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SourceConfig {

	@Bean
	Supplier<String> message() {
		return () -> "dfd";
	}
}
