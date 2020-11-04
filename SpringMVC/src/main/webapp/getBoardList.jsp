<%@page import="java.util.List"%>
<%@page import="com.lsw.biz.board.impl.BoardDAO"%>
<%@page import="com.lsw.biz.board.BoardVO"%>
<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<%
	// 세션에 저장된 글 목록을 꺼낸다

	// 	List<BoardVO> boardList = (List) session.getAttribute("boardList");
	// 	List<BoardVO> boardList = boardDAO.getBoardList(vo);

	//3. 응답 화면 구성
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>getBoardList</title>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet"
	href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
<script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
<style>
	tbody{text-align:center}
      table{text-align:center}
</style>

</head>

<body>
	<tbody>
		<div class="mdl-layout mdl-js-layout mdl-layout--fixed-header">
			<header class="mdl-layout__header"></header>
			<div class="mdl-layout__drawer">

				<h4>${userName }님의계정</h4>
				<a href="logout.do">Log-out</a>
				<hr>
				<br> <a href="insertBoard.jsp">새글 등록</a>


			</div>
			<h3>결제 서류 리스트</h3>
			<!-- 검색 시작 -->
			<form action="getBoardList.do" method="post">
				<table border="1" cellpadding="0" cellspacing="0"
					width="700">
					<tr>
						<td align="right">
							<select name="searchCondition">
								<c:forEach var="option" items="${conditionMap }">
									<option value="${option.value }">${option.key }
								</c:forEach>
						</select>
						<input name="searchKeyword" type="text" />
						<input type="submit" value="검색" />
						</td>
					</tr>
				</table>
			</form>
			<!-- 검색 종료 -->

			<table border="1" cellpadding="0" cellspacing="0"
				width="700">
				<tr>
					<th bgcolor="skyblue" width="100">번호</th>
					<th bgcolor="skyblue" width="200">제목</th>
					<th bgcolor="skyblue" width="150">작성자</th>
					<th bgcolor="skyblue" width="150">등록일</th>
					<th bgcolor="skyblue" width="100">조회수</th>
				</tr>

				<c:forEach var="board" items="${boardList }">
					<tr>
						<td>${board.seq }</td>
						<td align="left"><a href="getBoard.do?seq=${board.seq }">
								${board.title }</a></td>
						<td>${board.writer}</td>
						<td>${board.regDate }</td>
						<td>${board.cnt }</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</tbody>
</body>
</html>