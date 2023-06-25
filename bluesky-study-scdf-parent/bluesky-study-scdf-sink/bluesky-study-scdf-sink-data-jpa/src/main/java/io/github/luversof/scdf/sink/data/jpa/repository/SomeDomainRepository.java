package io.github.luversof.scdf.sink.data.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.luversof.scdf.sink.data.jpa.domain.SomeDomain;

public interface SomeDomainRepository extends JpaRepository<SomeDomain, Long> {

}
