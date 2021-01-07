package Ext;

import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ext_Test {

	@Test
	public  void test(){
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext( ExtConfig.class );
		java.lang.String B = "我发布的事件1";
		ac.publishEvent( new ApplicationEvent(B) {
		} ) ;
		((AnnotationConfigApplicationContext) ac).close();
	}
}
