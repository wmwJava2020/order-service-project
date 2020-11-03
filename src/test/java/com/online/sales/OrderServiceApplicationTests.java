package com.online.sales;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.platform.commons.logging.LoggerFactory;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class OrderServiceApplicationTests {

	public static Logger logger = (Logger) LoggerFactory.getLogger(OrderServiceApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case excuted.............");
		assertEquals(true, true);
	}

}
