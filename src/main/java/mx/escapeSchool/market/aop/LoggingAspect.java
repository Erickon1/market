package mx.escapeSchool.market.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	private static final Logger LOGGER =
			LogManager.getLogger(LoggingAspect.class);
	
	@Before("execution(* mx.escapeSchool.market.service..*(..))")
	public void before(JoinPoint joinPoint)throws Throwable{
		
		MethodSignature methodSignature = 
				(MethodSignature)joinPoint.getSignature();
		String[] paramNames = methodSignature.getParameterNames();
		String className = methodSignature.
				getDeclaringType().getSimpleName();
		String methodName = methodSignature.getName();
		Object[] listArgs = joinPoint.getArgs();
		String end = "";
		for (int i = 0; i < listArgs.length; i++) {
			if (i!=0) {
				end += ", ";
			}
			end += paramNames[i]+": "+listArgs[i].toString();
		}
		LOGGER.info(className+"."+methodName+" :: "+end);
		
	}
	
	@AfterReturning(
			pointcut = "execution(* mx.escapeSchool.market.service..*(..))",
			returning = "objectReturn" )
	public void after( JoinPoint joinPoint,
			Object objectReturn )throws Throwable{
		
		MethodSignature methodSignature = 
				(MethodSignature)joinPoint.getSignature();
		String className = methodSignature.
				getDeclaringType().getSimpleName();
		String methodName = methodSignature.getName();
		LOGGER.info(className+"."+methodName+" :: "+objectReturn);
		
	}

	@AfterThrowing(
			pointcut = "execution(* mx.escapeSchool.market.service..*(..))",
			throwing = "ex" )
	public void errors( Exception ex )throws Throwable{
		
		LOGGER.info(ex.getClass()+" ERROR "+ex.getMessage());
		
	}
}
