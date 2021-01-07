package Ioc;

import IOC.MainConfigOfIoc;
import domain.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IocTest {

	@Test
	public void test1() {
		ApplicationContext ac = new AnnotationConfigApplicationContext( MainConfigOfIoc.class );
		//Person p = (Person) ac.getBean( Person.class);

		//System.out.println(p.toString());
	}
}
