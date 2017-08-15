package com.example.demodepmgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoDepMgmtApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DemoDepMgmtApplication.class, args);
		MyBean bean = ctx.getBean(MyBean.class);
		bean.doSomething();
	}

	@Bean
	public MyBean myBean() {
		return new MyBean();
	}

	private static class MyBean {
		public void doSomething() {
			System.out.println("Doing something in MyBean");
		}
	}
}
