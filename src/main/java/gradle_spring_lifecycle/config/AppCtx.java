package gradle_spring_lifecycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import gradle_spring_lifecycle.spring.Client;

@Configuration
@ComponentScan(basePackages = {"gradle_spring_lifecycle.spring"})
public class AppCtx {
	/*
		@Bean
		@Qualifier("printer")
		public MemberPrinter memberPrinter() {
			return new MemberPrinter();
		}*/
	
	//@Bean(initMethod = "connect", destroyMethod = "close")
	@Bean
	public Client client() {
		Client client = new Client();
		client.setHost("host");
		return client;
	}
}