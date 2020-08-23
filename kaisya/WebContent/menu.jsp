<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>	
	<style type="text/css">
		h2{background-color: #66CCFF;
			}
		body{text-align:center}
	</style>
<meta charset="UTF-8">
<title>ユーザー管理</title>
</head>
<body>	
		<h2>勤務情報明細</h2>
		<form action="./task.jsp" method="post">
			<button type="submit"><pre><big>勤務情報明細</big></pre></button>
		</form>
		<hr>
		<h2>勤務情報検索</h2>
		<form action="./founduser.jsp" method="post">
			<button type="submit"><pre><big>勤務情報検索</big></pre></button>
		</form>
		<hr>
				<h2>勤務情報登録・更新・削除</h2>
		<form action="./Login.jsp" method="post">
			<button type="submit"><pre><big>勤務情報登録・更新・削除</big></pre></button>
		</form>
		<hr>
</body>
</html>