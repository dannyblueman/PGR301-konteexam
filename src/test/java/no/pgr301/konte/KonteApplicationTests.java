package no.pgr301.konte;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class KonteApplicationTests {

//	@Test
//	void contextLoads() {
//	}

	@Test
	void workflowTestTest() { assertEquals(KonteApplication.workflowTest(), "You shall not fail"); }

}
