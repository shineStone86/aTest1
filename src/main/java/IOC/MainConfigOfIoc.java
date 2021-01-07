package IOC;


import domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfigOfIoc {


	@Bean
	public Person person(){
		return new Person();
	}
}
