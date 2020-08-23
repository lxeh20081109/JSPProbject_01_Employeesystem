<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="mode.worktimemeisai,mode.gettimemeisai,java.util.List" %>
<% 
	int i = 0;

%>
<!DOCTYPE html>
<html>
<head>
		<style type="text/css">
			div{text-align:center}
			.h2{background-color:blue}
			.div3{margin:3px;}
			table{
				margin-top:4px;
				  margin:0 auto;
				  border-radius:10px;
				  -webkit-border-radius:10px;
				  -moz-border-radius:10px;
				  border:1px solid #666;
				  border-spacing: 0;
				  overflow:hidden;
			}
			button{
				  width:100px;
				  height:40px;
				  display: inline-block;
				  position: relative;
				  padding: 0.5em 1.4em;
				  text-decoration: none;
				  background: #668ad8;/*ボタン色*/
				  color: #FFF;
				  border-bottom: solid 5px #36528c;/*ボタン色より暗めに*/
				  border-right: solid 5px #5375bd;/*ボタン色より暗めに*/}
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
	<h1></h1>
		<h1>勤務情報検索</h1>
		
		<div class ="div3">
			
			
			<div style="display:inline-flex">
				<form method="post" action="./text2">
					<lable><strong>社員ID:</strong></lable><input type="text" name="syaID">
					<label><strong>社員名:</strong></label><input type="text" name="syaname">
					<label><strong>勤務年月:</strong></label><input type="text" name="syayearmonth">
					<button type="submit">検索</button>
					<button type="reset">クリア</button>
				</form>
				<form method="post" action="./menu.jsp">
					<button type="submit">戻る</button>
				</form>
			</div>
	
		</div>
	
		<br>
		<table  align=center >
			<tr>
				<th class="r1">NO</th>
				<th>社員ID</th>
				<th>社員名</th>
				<th>勤務年月</th>
				<th>作業時間</th>
				<th>残業基準時間</th>
				<th></button></th>
			</tr>

			<c:forEach var="work" items="${worktime}" varStatus="state">
				<tr>
					<td>${state.index + 1}</td>
					<td>${work.emp_id}</td>
					<td>${work.name}</td>
					<td>${work.job_date}</td>
					<td>${work.job_time}</td>
					<td>${work.add_time}</td>
					<td><button type="button">詳細入力</td>
				</tr>
			</c:forEach>

		</table>
	</div>
</body>
</html>