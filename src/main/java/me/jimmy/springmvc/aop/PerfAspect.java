package me.jimmy.springmvc.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerfAspect {

    @Around("@annotation(PerLogging)")
    public Object logPerf(ProceedingJoinPoint pjp) throws Throwable {
        long begin = System.currentTimeMillis();
        Object retVal = pjp.proceed();
        System.out.println(System.currentTimeMillis()-begin);
        return retVal;
    }
    // logPerf is Advice

    @Before("bean(simpleEventService)")
    public void hello() {
        System.out.println("hello Before");
    }
}
