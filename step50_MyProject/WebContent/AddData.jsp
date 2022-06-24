<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AddData</title>
	<style>
	 .button{width:150px; height:70px; background:#F06A00; 
             text-align:center; line-height:70px; font-size:100%; 
             border:10px solid white; box-shadow:5px 5px 5px #555555;
             border-radius:30px; text-shadow:2px 2px 2px #333333;}
	</style>
</head>
<body>
 <form action="depts">
	    <input type=hidden name="command" value="add">
	<table align="center" border="0" cellpadding="5" cellspacing="2" width="100%" bordercolordark="white" bordercolorlight="black">
		<tr>
	        <td bgcolor="#546699">
	            <p align="center"><font color="white"><b><span style="font-size:9pt;">DEPTNO 입력</span></b></font></p>
	        </td>
	        <td bgcolor="#656699">
	            <p align="center"><font color="white"><b><span style="font-size:9pt;">DNAME 입력</span></b></font></p>
	        </td>
	        <td bgcolor="#766699">
	            <p align="center"><font color="white"><b><span style="font-size:9pt;">L O C 입력</span></b></font></p>
	        </td>
	    </tr>
	    <!-- 데이터 입력 라인 -->
	    <form action="depts">
	    <input type=hidden name="command" value="add">
		    <tr>
		        <td>
		        	<input type="text" name="DEPTNO">
		        </td>
		        <td>
		           <input type="text"name="DNAME">
		        </td>
		        <td>
		           <input type="text"name="LOC">
		        </td>
		    </tr>
		    <hr>
	</table>
		   <div align=left><button class="button"type="submit">데이터 입력</button></div>
</form>
	

</body>
</html>