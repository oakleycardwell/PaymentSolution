package com.PNC.PaymentSolution;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PaymentSolutionApplicationTests {

	@Autowired
	private Application application;

	@Test
	public void contextLoads() {
		assertThat(application).isNotNull();
	}

}
