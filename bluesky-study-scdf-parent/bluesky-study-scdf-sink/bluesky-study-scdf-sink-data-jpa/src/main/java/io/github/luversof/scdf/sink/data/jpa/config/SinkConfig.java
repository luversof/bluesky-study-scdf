package io.github.luversof.scdf.sink.data.jpa.config;

import java.util.function.Consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.luversof.scdf.sink.data.jpa.domain.SomeDomain;
import io.github.luversof.scdf.sink.data.jpa.service.SomeDomainService;

@Configuration
public class SinkConfig {
	
	@Bean
	Consumer<String> message(SomeDomainService someDomainService) {
		return message -> {
			SomeDomain someDomain = new SomeDomain();
			someDomain.setSomeValue(message);
			someDomainService.save(someDomain);
		};
	}
}
