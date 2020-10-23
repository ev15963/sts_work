package com.lsw.biz.board.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterThrowingAdvice {
	public AfterThrowingAdvice() {
	}
	@Pointcut("execution(* com.lsw.biz..*Impl.*(..))")
	public void allPointcut(){}
	
	@AfterReturning(pointcut="allPointcut()", throwing="exceptObj")
	public void exceptionLog(JoinPoint jp, Exception exceptObj) {
		String method=jp.getSignature().getName();
		
		System.out.println(method+"() �޼ҵ� ���� �� ���� �߻�!");
		
		if(exceptObj instanceof IllegalArgumentException) {
			System.out.println("�������� ���� �ԷµǾ����ϴ�.");
		} else if(exceptObj instanceof NumberFormatException) {
			System.out.println("���� ������ ���� �ƴմϴ�.");
		} else if (exceptObj instanceof Exception) {
			System.out.println("������ �߻��߽��ϴ�.");
		}
	}
}