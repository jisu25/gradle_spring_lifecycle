package gradle_spring_lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import gradle_spring_lifecycle.config.AppCtx;
import gradle_spring_lifecycle.spring.Client;

public class Main {
	public static void main(String[] args) {

		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		
		Client client = ctx.getBean(Client.class);
		client.send();
		
		ctx.close();
	}
}
