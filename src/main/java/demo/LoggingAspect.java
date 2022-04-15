package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    //two dots need to if the methods having arguments, it takes 1 to n no of arguments
    @Before("execution(* demo.ShoppingCart.checkOut(..))")
    public void beforeLogger(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature());
        System.out.println("Before Loggers with argument " + joinPoint.getArgs()[0].toString());
        System.out.println("Before Loggers");
    }

    @After("execution(* *.*.checkOut(..))")
    public void afterLogger() {
        System.out.println("AfterLoggers");
    }

    @Pointcut("execution(* demo.ShoppingCart.quantity(..))")
    public void afterReturningPointCut(){

    }

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal) {
        System.out.println("After returning "+retVal);
    }
}
