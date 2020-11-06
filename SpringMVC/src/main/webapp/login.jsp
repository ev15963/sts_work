<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>로그인</title>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet"
	href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
<script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
</head>

<body>
	<div class="mdl-layout mdl-js-layout mdl-layout--fixed-header">
		<header class="mdl-layout__header"></header>
		
		<h3>로그인</h3>
			<!-- 검색 시작 -->
	<form action="login.do" method="post">
			<table align="center" border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="skyblue">아이디</td>
					<td><input type="text" name="id" value="${user.id }" /></td>
				</tr>
				<tr>
					<td bgcolor="skyblue">비밀번호</td>
					<td><input type="password" name="password" value="${user.password }" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
					<input type="submit" value="로그인" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
