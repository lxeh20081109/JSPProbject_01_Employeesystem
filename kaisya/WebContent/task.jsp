<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="mode.worktimemeisai,mode.gettimemeisai,java.util.List" %>
<% 
	
%>
<!DOCTYPE html>
<html>
<head>
		<style type="text/css">
			div{text-align:center}
			.h2{background-color:blue}
			table{
			  margin:0 auto;
			  border-radius:10px;
			  -webkit-border-radius:10px;
			  -moz-border-radius:10px;
			  border:1px solid #666;
			  border-spacing: 0;
			  overflow:hidden;
			}
			td,th{
				  border-bottom:1px solid #666;
				}
			td,th{
				  padding:10px;
				}
				th{
				  background:#EFEFEF;
				}
				table tbody tr:last-child th,
				table tbody tr:last-child td{
				  border-bottom: none;
				}
				th + th,td{
  border-left:1px solid #666;
}
		
		</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head> 
<body>
	
	<div>
	<h1 class="h2"></h1>
		<h1>勤務情報明細</h1>
		社員ID:&nbsp
		社員名:&nbsp
		勤務年月:
		
		<table border=1 align=center>
			<tr>
				<th>日付</th>
				<th>作業開始時間</th>
				<th>作業終了時間</th>
				<th>休憩時間</th>
				<th>作業時間</th>
				<th>備考</th>
			</tr>
			<c:forEach var="work" items="${worktimemeisai}">
				<tr>
					<td>${work.job_day}</td>
					<td>${work.job_start}</td>
					<td>${work.job_end}</td>
					<td>${work.break_time}</td>
					<td>${work.job_time}</td>
					<td>${work.memeo}</td>
				</tr>
			</c:forEach>

		</table>
	</div>



</body>
</html>