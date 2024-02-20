package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: starts");

        Object targetMethodResult = proceedingJoinPoint.proceed();

        System.out.println("aroundReturnBookLoggingAdvice: ends");
        return targetMethodResult;
    }
}
