<%@page import="com.lsw.biz.user.impl.UserDAO"%>
<%@page import="com.lsw.biz.user.UserVO"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>새글등록</title>
</head>
<body align="center">
	<h1>글등록</h1>
	<a href="logout.do">Log-out</a>
	<hr>
	
	
	<form action="insertBoard.do" method="post">
		<table boarder="1" cellpadding="0" cellspacing="0">
			<tr>
				<td bgcolor="orange" width="70">제목</td>
				<td align="left"><input type="text" name="title" /></td>
			</tr>
			<tr>
				<td bgcolor="orange" width="70">작성자</td>
				<td align="left"><input type="text" name="writer" size="10" />
				</td>
			</tr>
			<tr>
				<td bgcolor="orange" width="70">내용</td>
				<td align="left"><textarea type="content" name="content"
						cols="40" rows="10" /> </textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="새글 등록" /></td>
			</tr>
		</table>
	</form>
	<hr>
	<a href="getBoardList.do">글 목록 가기</a>

</body>
</html>