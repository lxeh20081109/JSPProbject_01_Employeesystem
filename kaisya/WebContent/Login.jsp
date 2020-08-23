<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<style type="text/css">
			h1{padding:5px}
			.h2{
				background-color:blue}
			div{
				text-align:center;
				padding:5px;}
			.div1{text-align:center;
				padding:10px;}
	</style>
<meta charset="UTF-8">
<title>hello</title>
</head>
<body>
	<h1 class="h2"></h1>
	<div>
		
		<h1>社員管理システム</h1>
		<form method="post" action="/kaisya/text1">
			<div>
				<label for="username">ログインID:</label>
				<input type="text" name="user">
			</div>
			<div>
				<label for="password">パスワード:</label>
				<input type="text" name="pass">
			</div>
			<div class="div1">						
					<input type="submit" value="ログイン" >
			</div>
		</form>
	</div>


</body>
</html>