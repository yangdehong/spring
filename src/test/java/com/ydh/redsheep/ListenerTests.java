package com.ydh.redsheep;

import com.ydh.redsheep.listeners.MyEvent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ListenerTests {

	@Resource
	private ApplicationContext applicationContext;

	@Test
	public void contextLoads() {
		MyEvent myEvent = new MyEvent("myListener");
		applicationContext.publishEvent(myEvent);
	}

}
