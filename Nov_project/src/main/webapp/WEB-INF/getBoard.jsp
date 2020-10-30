<%@ page import="com.lsw.biz.board.impl.BoardDAO" %>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 상세</title>
</head>
<body>
	<h1> 글 상세 </h1>
	<a href="logout.do">log-out</a>
	<hr>
	<div align="center">
		<form action="updateBoard.do" method="get">
			<input name="seq" type="hidden" value="${board.seq }" />
			<table border="1">
				<tr>
					<td bgcolor="blue" width="70"> 제목 </td>
					<td align="left"><input name="title" type="text"
					value="${board.title }" /><td>
				</tr>
				<tr>
					<td bgcolor="blue">작성자</td>
					<td align="left">${board.writer }</td>
				</tr>
				<tr>
				<td bgcolor="blue">내용</td>
				<td align="left"><textarea name="content" rows="10" cols="40">
				${board.cotent }</textarea></td>
				</tr>
				<tr>
					<td bgcolor="blue">등록일</td>
					<td align='left'>${board.cnt }</td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
					value="글 수정" /></td>
				</tr>
			</table>
		</form>
	</div>
	<hr>
	<a href="insertBoard.jsp">글등록</a>&nbsp;&nbsp;&nbsp;
	<a href="deleteBoard.do?seq=${board.seq }">글삭제</a>
	<a href="getBoardList.do">글목록</a>
</body>
</html>