package com.Yebolo;

import com.Yebolo.dto.Response;
import com.Yebolo.service.FetchNextNumberService;
import com.Yebolo.service.impl.FetchNextNumberServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class YeboloApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void test1(){
		FetchNextNumberService service = new FetchNextNumberServiceImpl();
		Response response = service.fetchNextNumber(45);
		Assert.notNull(response, "Response came null");
		Assert.isTrue(response.getNewValue().equals(1), "Test case 1 failed");
	}

	@Test
	void test2(){
		FetchNextNumberService service = new FetchNextNumberServiceImpl();
		Response response = service.fetchNextNumber(3);
		Assert.notNull(response, "Response came null");
		Assert.isTrue(response.getNewValue().equals(0), "Test case 2 failed");
	}

	@Test
	void test3(){
		FetchNextNumberService service = new FetchNextNumberServiceImpl();
		Response response = service.fetchNextNumber(10);
		Assert.notNull(response, "Response came null");
		Assert.isTrue(response.getNewValue().equals(1), "Test case 3 failed");
	}

	@Test
	void test4(){
		FetchNextNumberService service = new FetchNextNumberServiceImpl();
		Response response = service.fetchNextNumber(93);
		Assert.notNull(response, "Response came null");
		Assert.isTrue(response.getNewValue().equals(2), "Test case 4 failed");
	}
}
