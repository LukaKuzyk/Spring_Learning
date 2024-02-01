package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspects {

    @Before("execution(public void getBook(aop.Book))")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: attempt to get");
    }

//    @Before("execution(public * returnBook())")
//    public void beforeReturnBookAdvice(){
//        System.out.println("beforeReturnBookAdvice: attempt to return");
//    }

}
