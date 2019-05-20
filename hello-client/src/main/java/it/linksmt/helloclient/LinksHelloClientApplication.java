package it.linksmt.helloclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;

@SpringBootApplication
@RestController
public class LinksHelloClientApplication implements GreetingController {

	public static void main(String[] args) {
		SpringApplication.run(LinksHelloClientApplication.class, args);
	}

    @Autowired
    @Lazy
    private EurekaClient eurekaClient;
 
    @Value("${spring.application.name}")
    private String appName;

	/* (non-Javadoc)
	 * @see it.linksmt.serviceregistry.GreetingController#greeting()
	 */
	@Override
	public String greeting() {
		return String.format("Hello from '%s'!", eurekaClient.getApplication(appName).getName());
	}

}
