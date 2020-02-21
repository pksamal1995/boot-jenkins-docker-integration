package jenkins.docker.bootjenkinsdockerintegration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootJenkinsDockerIntegrationApplicationTests {

	Logger logger = LoggerFactory.getLogger(BootJenkinsDockerIntegrationApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("Running the Test Cases");
		assertEquals(true, true);
	}

}
