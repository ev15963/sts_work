package com.lsw.biz.board.common;

//@Service
//@Aspect
public class AfterAdvice {
//	@Pointcut("execution(* com.lsw.biz..*Impl.*(..))")
	public void allPointCut(){}
	
//	@After("allPointCut()")
	public void finallyLog() {
		System.out.println("[사후처리] 비즈니스 로직 수행 후 무조건 동작");
	}
}
