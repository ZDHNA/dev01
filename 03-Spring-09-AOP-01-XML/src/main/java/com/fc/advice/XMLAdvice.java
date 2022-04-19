package com.fc.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class XMLAdvice {
    public void before(){
        System.out.println("前置通知，方法执行前执行");
    }
    public void afterReturning(){
        System.out.println("后置通知，方法正常返回后执行");
    }
    public void after(){
        System.out.println("最终通知，无论发生什么都会执行");
    }
    public void afterThrowing(){
        System.out.println("异常通知，方法发生异常时执行");
    }
    public Object around (ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("环绕通知--前置");
          Object proceed=joinPoint.proceed();
        System.out.println("环绕通知--后置");
        return proceed;
    }
}
