package com.lsw.biz.board.common;

import org.aspectj.lang.JoinPoint;

import com.lsw.biz.board.BoardVO;

public class AfterReturningAdvice {
	public void afterLog(JoinPoint jp, Object returnObj) {
		String method = jp.getSignature().getName();
		if (returnObj instanceof BoardVO) {
			BoardVO BVO = (BoardVO) returnObj;
			if(BVO.getWriter().equals("test")) {
				System.out.println("ddddd");
				System.out.println(BVO.getWriter() + "로그인(Admin)");
			}
		}
		System.out.println("[사후처리] "+method+ "() 메소드 리턴값 : "
				+ returnObj.toString());
	}
}
