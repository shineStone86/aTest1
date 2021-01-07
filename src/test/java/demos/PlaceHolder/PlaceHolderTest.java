package demos.PlaceHolder;


import domain.Me;
import domain.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PlaceHolderTest {

	@Test
     public  void test(){
		ApplicationContext ac = new AnnotationConfigApplicationContext( PlaceHolderConfig.class );
		 Person p= ac.getBean( Me.class );
		System.out.println("王======");
		 System.out.println(p.toString()+"sdfsadfasdf王1");

	 }
	 @Test
	 public void test1(){
		 System.out.println("王======");
	 }
}
