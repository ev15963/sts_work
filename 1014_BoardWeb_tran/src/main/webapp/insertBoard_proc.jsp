<%@page import="com.lsw.biz.board.impl.BoardDAO"%>
<%@page import="com.lsw.biz.board.BoardVO"%>
<%@page import="com.lsw.biz.user.impl.UserDAO" %>
<%@page import="com.lsw.biz.user.UserVO" %>
<%@ page contentType="text/html; charset=UTF-8"%>

<% 

//1. 사용자 입력 정보 추출
request.setCharacterEncoding("UTF-8");
String title=request.getParameter("title");
String writer=request.getParameter("writer");
String content=request.getParameter("content");

//2. DB 연동 처리
BoardVO vo = new BoardVO();
vo.setTitle(title);
vo.setWriter(writer);
vo.setContent(content);

BoardDAO bDAO = new BoardDAO();
bDAO.insertBoard(vo);

//3. 화면 네비게이션
response.sendRedirect("getBoardList.jsp");
%>