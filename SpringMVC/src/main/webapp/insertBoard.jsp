<%@page import="com.lsw.biz.user.impl.UserDAO"%>
<%@page import="com.lsw.biz.user.UserVO"%>
<%@ page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>getBoard.jsp</title>
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
		
		<h4>${userName }님의 계정 </h4>
		<a href="logout.do">Log-out</a> <hr><br>
		<a href="getBoardList.do">글목록</a>
			&nbsp;&nbsp;&nbsp; 
		
		
		</div>
		<h3>결제 서류 등록</h3>
			<!-- 검색 시작 -->
	<form action="insertBoard.do" method="post">
		<table boarder="1" cellpadding="0" cellspacing="0">
			<tr>
				<td bgcolor="skyblue" width="70">제목</td>
				<td align="left"><input type="text" name="title" /></td>
			</tr>
			<tr>
				<td bgcolor="skyblue" width="70">작성자</td>
				<td align="left"><input type="text" name="writer" size="10" />
				</td>
			</tr>
			<tr>
				<td bgcolor="skyblue" width="70">내용</td>
				<td align="left"><textarea type="content" name="content" cols="40" rows="10"> </textarea></td>
			</tr>
			<tr>
				<td bgcolor="skyblue" width="70">파일 첨부</td>
				<td align="left"><input type="file" name="uploadFile" />
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="새글 등록" /></td>
			</tr>
		</table>
	</form>
	</div>
</body>
</html>