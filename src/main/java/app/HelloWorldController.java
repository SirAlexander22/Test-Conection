package app;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class HelloWorldController {

	private String hello ="Hello HelloWorldController";

	public String getHello() {
		return hello;
	}
}
