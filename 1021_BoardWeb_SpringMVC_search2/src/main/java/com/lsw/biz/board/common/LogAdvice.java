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
	public void allPointcut(){} //��ü�� ��������� ����
	
	@Before("allPointcut()")
	public void printLog(JoinPoint jp) {
		System.out.println("[���� �α�] ����Ͻ� ���� ���� �� ����");
	}
}