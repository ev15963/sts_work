package com.lsw.biz.board.common;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;
@Service
@Aspect //Aspect = pointcut +advice
public class LogAdvice {

	public LogAdvice() {
	}

//	@Pointcut("execution(* com.lsw.biz..*Impl.*(..))")
//	public void allPointcut(){} //��ü�� ��������� ����

//	@Pointcut("execution(* com.lsw.biz..*Impl.get*(..))")
//	public void getPointcut(){} //��ü�� ��������� ����
	
	
	
//	@Before("allPointcut()")
	public void printLog() {
		System.out.println("[���� �α�] ����Ͻ� ���� ���� �� ����");
	}
}