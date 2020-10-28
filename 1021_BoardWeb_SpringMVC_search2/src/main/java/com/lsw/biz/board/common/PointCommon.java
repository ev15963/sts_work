package com.lsw.biz.board.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointCommon {
	@Pointcut("execution(* com.lsw.biz..*Impl.*(..))")
	public void allPointcut(){}
	
	@Pointcut("execution(* com.lsw.biz..*Impl.get*(..))")
	public void getPointcut(){}
}
