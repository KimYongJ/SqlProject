<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
	 .button{width:150px; height:70px; background:#F06A00; 
             text-align:center; line-height:70px; font-size:100%; 
             border:10px solid white; box-shadow:5px 5px 5px #555555;
             border-radius:30px; text-shadow:2px 2px 2px #333333;}
     #input1{width=100%; height:40px;}
     .box{
     }
	</style>
</head>
<body>
<form action="depts">
	<input type=hidden name="command"value="delete">
	     <span class="box"style="font-size:15pt;">삭제할 DEPTNO 입력 </span><hr>
	     <!-- 데이터 입력 라인 -->
		 <input id="input1"type="text" name="DEPTNO"placeholder="🔎Search">
		 <br><br>
		 <div align=left><button class="button"type="submit">데이터 삭제</button></div>
</form>
</body>
</html>