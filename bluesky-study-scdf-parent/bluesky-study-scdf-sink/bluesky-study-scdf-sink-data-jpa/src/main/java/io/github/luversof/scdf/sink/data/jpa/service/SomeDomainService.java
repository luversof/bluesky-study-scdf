package io.github.luversof.scdf.sink.data.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.luversof.scdf.sink.data.jpa.domain.SomeDomain;
import io.github.luversof.scdf.sink.data.jpa.repository.SomeDomainRepository;

@Service
public class SomeDomainService {

	@Autowired
	private SomeDomainRepository someDomainRepository;
	
	public SomeDomain save(SomeDomain someDomain) {
		return someDomainRepository.save(someDomain);
	}
}
