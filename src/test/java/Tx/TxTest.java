package Tx;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TxTest {

	@Test
	public void test(){
		ApplicationContext ac = new AnnotationConfigApplicationContext( TxConfig.class );
		UserService userService = ac.getBean( UserService.class );
		userService.insertUser();
	}
}
