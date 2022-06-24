package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DeptDAO;
import model.DeptDTO;
import model.DeptSearch;
@WebServlet("/searchcontroller")
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public SearchController() {}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dept=request.getParameter("deptno");
		ArrayList<DeptDTO> arr= DeptSearch.searchDept(dept);
		String url = "Show.jsp";
		if(arr!=null) {
			request.setAttribute("list", arr);	
		}else{
			response.sendRedirect("failView.jsp");
		}
		request.getRequestDispatcher(url).forward(request, response);
	}
}
