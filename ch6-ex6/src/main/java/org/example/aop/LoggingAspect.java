package org.example.aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.Objects;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private static final Log log = LogFactory.getLog(LoggingAspect.class);
    private final Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    //@Around("execution(* org.example.service.*.*(..))")
    @Around("@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {

        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();


        logger.info("\n\n\n메서드: " + methodName + ", 매개변수: " + Arrays.asList(args));

        logger.info(">>>>>>>>>>>>> 함수 호출전!!!");
        Object object = joinPoint.proceed();
        logger.info(">>>>>>>>>>>>> 함수 호출후!!!");

        logger.info("리턴값: " + object + "\n\n\n");

        return "FAILED";

        //return object;
    }

}
