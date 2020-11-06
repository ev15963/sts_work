<%@ page import="com.lsw.biz.board.impl.BoardDAO"%>
<%@ page import="com.lsw.biz.board.BoardVO"%>
<%@ page contentType="text/html; charset=UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>drawer icon color</title>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet"
	href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
<script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
</head>

<body>
	<div class="mdl-layout mdl-js-layout mdl-layout--fixed-header">
		<header class="mdl-layout__header"></header>
		<div class="mdl-layout__drawer">

			<h4>${userName }님의계정</h4>
			<a href="logout.do">Log-out</a>
			<hr>
			<br> <a href="insertBoard.jsp">글등록</a><br> <a
				href="deleteBoard.do?seq=${board.seq }">글삭제</a><br> <a
				href="getBoardList.do">글목록</a> &nbsp;&nbsp;&nbsp;
		</div>


		<h3>결제 내역 상세</h3>
		<!-- 검색 시작 -->
		<form action="updateBoard.do" method="get">
			<input name="seq" type="hidden" value="${board.seq }" />
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="skyblue" width="70">제목</td>
					<td align="left"><input name="title" type="text"
						value="${board.title }" /></td>
				</tr>
				<tr>
					<td bgcolor="skyblue">작성자</td>
					<td align="left">${board.writer }</td>
				</tr>
				<tr>
					<td bgcolor="skyblue">내용</td>
					<td align="left"><textarea name="content" cols="40" rows="10">
					${board.content }
					</textarea></td>
				</tr>
				<tr>
					<td bgcolor="skyblue">등록일</td>
					<td align="left">${board.regDate }</td>
				</tr>
				<tr>
					<td bgcolor="skyblue">조회수</td>
					<td align="left">${board.cnt }</td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="글 수정" /></td>
				</tr>

			</table>
		</form>
		<br>
		<hr>
	</div>
</body>
</html>