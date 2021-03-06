<%@page import="java.util.List"%>
<%@page import="com.lsw.biz.board.impl.BoardDAO"%>
<%@page import="com.lsw.biz.board.BoardVO"%>
<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix ="c" uri="http://java.sun.com/jstl/core_rt" %>

<%
	// 세션에 저장된 글 목록을 꺼낸다
	
	List<BoardVO> boardList = (List) session.getAttribute("boardList");
// 	List<BoardVO> boardList = boardDAO.getBoardList(vo);

	//3. 응답 화면 구성
	

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 목록</title>
</head>
<body align ="center">
		<h1>글 목록</h1>
		<h3>
			테스트님 환영합니다. <a href="logout.do">Log-out</a>
		</h3>

		<!-- 검색 시작 -->
		<form action="getBoardList.jsp" method="post">
			<table boarder="1" cellpadding="0" cellspacing="0" width="700">
				<tr>
					<td align="right">
						<select name="searchCondition">
								<option value="TITLE">제목
								<option value="CONTENT">내용
						</select>
						<input name="searchKeyword" type="text" />
						<input type="submit" value="검색" />
					</td>
				</tr>
			</table>
		</form>
		<!-- 검색 종료 -->

		<table boarder="1" cellpadding="0" cellspacing="0" width="700">
			<tr>
				<th bgcolor="orange" width="100">번호</th>
				<th bgcolor="orange" width="200">제목</th>
				<th bgcolor="orange" width="150">작성자</th>
				<th bgcolor="orange" width="150">등록일</th>
				<th bgcolor="orange" width="100">조회수</th>
			</tr>

			<c:forEach var="board" items="${boardList }">
			<tr>
				<td>${board.seq }</td>
				<td align="left"><a href="getBoard.do?seq=${board.seq }"> ${board.title }</a></td>
				<td>${ board.writer}</td>
				<td>${board.regDate }</td>
				<td>${board.cnt }</td>
			</tr>
			</c:forEach>

		</table>
		<br> <a href="insertBoard.jsp">새글 등록</a>
</body>
</html>