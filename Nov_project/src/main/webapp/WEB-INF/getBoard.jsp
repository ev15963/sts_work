<%@ page import="com.lsw.biz.board.impl.BoardDAO" %>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>�� ��</title>
</head>
<body>
	<h1> �� �� </h1>
	<a href="logout.do">log-out</a>
	<hr>
	<div align="center">
		<form action="updateBoard.do" method="get">
			<input name="seq" type="hidden" value="${board.seq }" />
			<table border="1">
				<tr>
					<td bgcolor="blue" width="70"> ���� </td>
					<td align="left"><input name="title" type="text"
					value="${board.title }" /><td>
				</tr>
				<tr>
					<td bgcolor="blue">�ۼ���</td>
					<td align="left">${board.writer }</td>
				</tr>
				<tr>
				<td bgcolor="blue">����</td>
				<td align="left"><textarea name="content" rows="10" cols="40">
				${board.cotent }</textarea></td>
				</tr>
				<tr>
					<td bgcolor="blue">�����</td>
					<td align='left'>${board.cnt }</td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
					value="�� ����" /></td>
				</tr>
			</table>
		</form>
	</div>
	<hr>
	<a href="insertBoard.jsp">�۵��</a>&nbsp;&nbsp;&nbsp;
	<a href="deleteBoard.do?seq=${board.seq }">�ۻ���</a>
	<a href="getBoardList.do">�۸��</a>
</body>
</html>