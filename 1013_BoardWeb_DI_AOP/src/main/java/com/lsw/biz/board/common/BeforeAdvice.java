package com.lsw.biz.board.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class BeforeAdvice {
	
	
	
	public BeforeAdvice() {
	}
	
	@Pointcut("execution(* com.lsw.biz..*Impl.*(..))")
	public void allPointCut(){}
	
	@Before("allPointCut()")
	public void beforeLog(JoinPoint jp) {
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		
		
		System.out.println("[사전처리] 11111"+ method+"() 메소드 ARGS 정보 : "+args[0].toString());
	}
}
