package io.github.luversof.scdf.sink;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import io.github.luversof.scdf.sink.data.jpa.Application;
import io.github.luversof.scdf.sink.data.jpa.domain.SomeDomain;
import io.github.luversof.scdf.sink.data.jpa.repository.SomeDomainRepository;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@SpringBootTest(classes = Application.class, webEnvironment = WebEnvironment.NONE)
class SomeDomainTest {
	
	@Autowired
	private SomeDomainRepository someDomainRepository;

	@Test
	void test() {

		var someDomainList = someDomainRepository.findAll();
		log.debug("Test : {}", someDomainList);
	}
	
	@Test
	void test2() {
		var someDomain = new SomeDomain();
		
//		someDomain.setArrayValue("aaa, bbb, ccc".split(","));
		someDomain.setSomeValue("someValue");
		var result = someDomainRepository.save(someDomain);
		log.debug("result : {}", result);
	}
}
