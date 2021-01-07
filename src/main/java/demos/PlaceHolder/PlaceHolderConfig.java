package demos.PlaceHolder;

import domain.Me;
import domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "demos.PlaceHolder")
@PropertySource( value="classpath:placeHolder.properties" ,encoding="UTF-8")
public class PlaceHolderConfig {

	@Bean
	public Person person(){
		return new Me();
	}

}
