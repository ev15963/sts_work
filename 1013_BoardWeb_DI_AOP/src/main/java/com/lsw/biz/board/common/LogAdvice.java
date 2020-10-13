package com.lsw.biz.board.common;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;
@Service
@Aspect //Aspect = pointcut +advice
public class LogAdvice {

	public LogAdvice() {
	}

//	@Pointcut("execution(* com.lsw.biz..*Impl.*(..))")
//	public void allPointcut(){} //객체가 만들어지고 엮음

//	@Pointcut("execution(* com.lsw.biz..*Impl.get*(..))")
//	public void getPointcut(){} //객체가 만들어지고 엮음
	
	
	
//	@Before("allPointcut()")
	public void printLog() {
		System.out.println("[공통 로그] 비즈니스 로직 수행 전 동작");
	}
}
