<%@page import="com.khj.biz.board.impl.BoardDAO"%>
<%@page import="com.khj.biz.board.BoardVO"%>
<%@page contentType="text/html; charset=UTF-8"%>

	<%
		//1.사용자 입력 정보 추출		
		String seq=request.getParameter("seq");
		
		
		//2.DB연동처리
		BoardVO vo=new BoardVO();
		vo.setSeq(Integer.parseInt(seq));
		
		BoardDAO boardDAO=new BoardDAO();
		boardDAO.deleteBoard(vo);
		
		//3.화면 네비게이션
		
		response.sendRedirect("getBoardList.jsp");
		
	%>