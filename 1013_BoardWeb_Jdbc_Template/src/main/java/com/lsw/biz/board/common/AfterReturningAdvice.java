package com.lsw.biz.board.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

import com.lsw.biz.board.BoardVO;
import com.lsw.biz.user.UserVO;


@Service
@Aspect
public class AfterReturningAdvice {
	@Pointcut("execution(* com.lsw.biz..*Impl.get*(..))")
	public void getPointcut(){}
	
	@AfterReturning(pointcut="getPointcut()", returning="returnObj")
	public void afterLog(JoinPoint jp, Object returnObj) {
		String method = jp.getSignature().getName();
		
		if (returnObj instanceof BoardVO) {
			UserVO user = (UserVO) returnObj;
			if(user.getRole().equals("Admin")) {
				System.out.println("ddddd");
				System.out.println(user.getRole() + "�α���(Admin)");
			}
		}
		System.out.println("[����ó��] "+method+ "() �޼ҵ� ���ϰ� : "
				+ returnObj.toString());
	}
}
