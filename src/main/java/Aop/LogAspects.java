package Aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspects {

	@Pointcut("execution(public int Aop.MathCalculator.*(..))")
	public void pointCut(){

	}

	@Before( "pointCut()" )
	public void logStart(){
		System.out.println("start log....");
	}

	@After("pointCut()")
	public void logEnd(){
		System.out.println("end log....");
	}

	@AfterReturning(value = "pointCut()",returning = "result")
	public void logReturn(Object result){
		System.out.println("retrun log...."+result);
	}

	@AfterThrowing( value = "pointCut()",throwing = "e" )
	public void logExcetion(Exception e){
		System.out.println("Excetion log...."+e.getMessage());
	}
}
