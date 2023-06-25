package io.github.luversof.scdf.sink.data.jpa.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "SomeDomain")
public class SomeDomain {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idx;
	
	private String someValue;
}
