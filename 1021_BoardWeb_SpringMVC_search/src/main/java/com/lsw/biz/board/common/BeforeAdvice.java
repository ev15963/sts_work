package com.lsw.biz.board.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class BeforeAdvice {

	public BeforeAdvice() {
	}

//	@Pointcut("execution(* com.lsw.biz..*Impl.*(..))")
//	public void allPointCut() {
//	}

	@Before("PointcutCommon.allPointCut()")
	public void beforeLog(JoinPoint jp) {
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();

		System.out.println("[����ó��] 11111" + method + "() �޼ҵ� ARGS ���� : " + args[0].toString());
	}
}
