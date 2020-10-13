package com.lsw.biz.board.common;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterAdvice {
	@Pointcut("execution(* com.lsw.biz..*Impl.*(..))")
	public void allPointCut(){}
	
	@After("allPointCut()")
	public void finallyLog() {
		System.out.println("[����ó��] ����Ͻ� ���� ���� �� ������ ����");
	}
}
