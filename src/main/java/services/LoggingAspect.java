package services;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import utils.Chrono;

@Aspect
public class LoggingAspect {

	// @Before("execution(* get*(..))")
	// public void logBefore(JoinPoint jp) {
	//
	// System.out.println("logBefore() is running!");
	// System.out.println("hi : " + jp.getSignature().getName());
	// System.out.println("Method returned value is : ");
	// System.out.println("******");
	// }

	// @AfterReturning(pointcut = "execution(* getCustomerR*(..))", returning =
	// "result")
	// public void logAfterReturning(JoinPoint joinPoint, Object result) {
	//
	// System.out.println("logAfterReturning() is running!");
	// System.out.println("hi : " + joinPoint.getSignature().getName());
	// System.out.println("Method returned value is : " + result);
	// System.out.println("******");
	// }

	// @AfterThrowing(pointcut = "execution(* add*(..))", throwing = "error")
	// public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
	//
	// System.out.println("logAfterThrowing() is running!");
	// System.out.println("hi : " + joinPoint.getSignature().getName());
	// System.out.println("Exception : " + error);
	// System.out.println("******");
	//
	// }
	@Around("execution(* addCustomerAround*(..))")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

		Chrono chrono = new Chrono();
		System.out.println("logAround() is running!");
		System.out.println("hi method : " + joinPoint.getSignature().getName());
		System.out.println("hi arguments : " + Arrays.toString(joinPoint.getArgs()));
		System.out.println("Around before is running!");

		chrono.start();
		joinPoint.proceed(); // continue on the intercepted method
		chrono.stop();

		System.out.println("Around after is running!");
		System.out.println("******");
		System.out.println(chrono.getDureeMs());
	}

}
