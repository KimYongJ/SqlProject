<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
	.contain{
		display:flex;
		justify-content:space-around;
	}
	 .button{width:150px; height:70px; background:#F06A00; 
             text-align:center; line-height:70px; font-size:110%; 
             border:10px solid white; box-shadow:5px 5px 5px #555555;
             border-radius:30px; text-shadow:2px 2px 2px #333333;}
	</style>
</head>
<body>
<table align="center" border="0" cellpadding="5" cellspacing="2" width="100%" bordercolordark="white" bordercolorlight="black">
	<tr>
        <td bgcolor="#146699">
            <p align="center"><font color="white"><b><span style="font-size:9pt;">DEPTNO</span></b></font></p>
        </td>
        <td bgcolor="#556699">
            <p align="center"><font color="white"><b><span style="font-size:9pt;">DNAME</span></b></font></p>
        </td>
        <td bgcolor="#966699">
            <p align="center"><font color="white"><b><span style="font-size:9pt;">L O C</span></b></font></p>
        </td>
    </tr>
    
	<c:if test="${empty list || fn:length(list) == 0}">
		<tr>
	        <td colspan="5">
	            <p align="center"><b><span style="font-size:9pt;">데이터가 없습니다.</span></b></p>
	        </td>
	    </tr>
	</c:if>
	<!-- ★★★★★★★★데이터 출력하는 부분★★★★★★★★★★★★-->
	<c:forEach items="${requestScope.list}" var="data">
		    <tr>

		        <td bgcolor="">
					<p><span style="font-size:15pt;">
					<a href="searchcontroller?deptno=${data.getDeptno()}">${data.getDeptno()}</a></span></p>
		        </td>
		        <td bgcolor="">
		            <p align="center"><span style="font-size:15pt;">
						<a >
						 ${data.getDname()}</a>
					</span></p>
		        </td>
		        <td bgcolor="">
		            <p align="center"><span style="font-size:15pt;">
		             <a >${data.getLoc()}</a></span></p>
		        </td>
		    </tr>
	</c:forEach>
</table>
<hr>
<div class="contain">
	<div class="button">
		<a href="DeletData.jsp">데이터 삭제</a>
	</div>
	<div class="button">	
		<a href="AddData.jsp">데이터 추가</a>
	</div>
	<div class="button">	
		<a href="UpdateData.jsp">데이터 변경</a>
	</div>
</div>


</body>
</html>