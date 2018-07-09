package cn.lixing.zqProject.Logging.aop;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.springframework.stereotype.Component;


@Aspect
@Component
public class AspectsLogging {
	private final Logger logger=Logger.getLogger(AspectsLogging.class);
	@Around("execution(public * cn.lixing.zqProject.Pages.*.*(..))")
	public Object aroundMethod(ProceedingJoinPoint joinPoint) {
		String methodName=joinPoint.getSignature().getName();
		Object result=null;
		//ǰ��֪ͨ
		logger.info("The method "+methodName+" begins with "+Arrays.asList(joinPoint.getArgs()));
		//ִ�з���
		try {
			result=joinPoint.proceed();
			//����֪ͨ
			logger.info("The method "+ methodName+" begins result "+result);
		} catch (Throwable e) {
			//�쳣֪ͨ
			logger.info("the method "+ methodName+"exception "+e);
			throw new RuntimeException(e);
		}
		logger.info("the method "+ methodName+" ends");
		return result;
	}
}