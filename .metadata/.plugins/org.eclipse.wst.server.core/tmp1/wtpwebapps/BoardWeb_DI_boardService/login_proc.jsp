<%@page import="com.khj.biz.user.impl.UserDAO"%>
<%@page import="com.khj.biz.user.UserVO"%>
<%@page contentType="text/html; charset=UTF-8"%>

	<%
		//1.사용자 입력 정보 추출
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		
		//2.DB연동처리
		UserVO vo=new UserVO();
		vo.setId(id);
		vo.setPassword(password);
		
		UserDAO userDAO=new UserDAO();
		UserVO user=userDAO.getUser(vo);
		
		//3.화면 네비게이션
		if(user != null){
		response.sendRedirect("getBoardList.jsp");
		}else{
		response.sendRedirect("login.jsp");
		}
	%>