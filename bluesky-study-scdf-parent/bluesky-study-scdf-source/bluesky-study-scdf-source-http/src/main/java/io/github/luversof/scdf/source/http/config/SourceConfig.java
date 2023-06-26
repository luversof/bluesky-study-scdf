package io.github.luversof.scdf.source.http.config;

import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class SourceConfig {

	@Bean
	Supplier<String> message() {
		log.debug("source called");
		return () -> "dfd";
	}
}
