package Aop;

import IOC.MainConfigOfIoc;
import domain.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {

	@Test
	public void test1() {
		ApplicationContext ac = new AnnotationConfigApplicationContext( MainConfigOfAop.class );
		MathCalculator mc = ((AnnotationConfigApplicationContext) ac).getBean( MathCalculator.class );
		int i = 6;
		int j = 4;
		mc.div(i,j);
		System.out.println(mc.div( i,j ));

	}
}
