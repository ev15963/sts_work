package com.lsw.biz.board.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
@Service
public class LogAdvice {

	public LogAdvice() {
	}

	@Pointcut("execution(* com.lsw.biz..*Impl.*(..))")
	public void allPointcut(){} //객체가 만들어지고 엮음
	
	@Before("allPointcut()")
	public void printLog(JoinPoint jp) {
		System.out.println("[공통 로그] 비즈니스 로직 수행 전 동작");
	}
}
