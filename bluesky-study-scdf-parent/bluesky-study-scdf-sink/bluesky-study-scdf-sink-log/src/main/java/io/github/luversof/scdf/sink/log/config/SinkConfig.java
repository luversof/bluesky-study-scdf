package io.github.luversof.scdf.sink.log.config;

import java.util.function.Consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class SinkConfig {

	@Bean
	Consumer<String> message() {
		return message -> log.info("message : {}", message);
	}
}
