<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta content="text/html; charset="UTF-8">
<title>새글 등록</title>
</head>
<body align="center">
	<h1>등록하기</h1>
	<a href="logout.do">Log-out</a>
	<hr>
	
	<form action="insertBoard.do" method="post">
		<table boarder="1">
			<tr>
				<td bgcolor="blue" width="70">제목</td>
				<td align="left"><input type="text" name="title" /></td>
			</tr>
			<tr>
				<td bgcolor="blue" width="70"> 작성자 </td>
				<td align="left"><input type="text" name="writer" size="10" /></td>
			</tr>
			<tr>
				<td bgcolor="blue" width="70"> 내용</td>
				<td align="left"><textarea type="text" name="content" cols="40" row="10" /></textarea></td>
				
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="새글 등록" /></td>
			</tr>
		</table>
	</form>
</body>
</html>