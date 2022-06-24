<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.contain{
	display:flex;
	justify-content:space-evenly;
	}
.button{width:150px; height:70px; background:#F06A00; 
             text-align:center; line-height:70px; font-size:100%; 
             border:10px solid white; box-shadow:5px 5px 5px #555555;
             border-radius:30px; text-shadow:2px 2px 2px #333333;}
</style>

</head>
<body>
<h1>DEPTNO 값은 숫자만 입력 가능합니다.</h1>
<h1>DNAME 값이 입력되지 않았거나 </h1>
<h1>LOC 값이 입력되지 않았습니다.</h1>
<div class="contain" >
	<span class="button">
		<a href="startView.jsp">처음으로 돌아가기</a>
	</span>
</div>
</body>
</html>