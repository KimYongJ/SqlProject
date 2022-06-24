package controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DeptDAO;
import model.DeptDTO;
import model.DeptDelete;
import model.DeptInsert;
import model.DeptUpdate;
@WebServlet("/depts")
public class DeptController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DeptController() {}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String command=request.getParameter("command");
		if(command == null){
			command = "list";
		}		
		if(command.equals("list")){
			list(request, response);
		}else if(command.equals("add")){
			add(request, response);
		}else if(command.equals("delete")){
			delete(request, response);
		}else if(command.equals("update")){
			update(request, response);
		}
	}
	private void list(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		ArrayList<DeptDTO> arr=DeptDAO.getDept();
		String url = "Show.jsp";
		if(arr!=null) {
			request.setAttribute("list", arr);	
		}else{
			response.sendRedirect("failView.jsp");
		}
		request.getRequestDispatcher(url).forward(request, response);
	}
	private void add(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String Deptno = request.getParameter("DEPTNO");
		String Dname = request.getParameter("DNAME");
		String Loc = request.getParameter("LOC");
		int num=0;
		try {
			num = Integer.parseInt(Deptno);
			if(Dname.length()==0|Loc.length()==0) {
				response.sendRedirect("NotNumber.jsp");
				return;
			}
		}catch(Exception e) {
			response.sendRedirect("NotNumber.jsp");
			return;
		}
		if(DeptInsert.deptInsert(num,Dname,Loc)) {
			response.sendRedirect("startView.jsp");	
		}else {
			response.sendRedirect("failView.jsp");
		}	
		
	}
	private void delete(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String Deptno = request.getParameter("DEPTNO");
		int num=0;
		try {
			num = Integer.parseInt(Deptno);
		}catch(Exception e) {
			response.sendRedirect("NotNumber.jsp");
			return;
		}
		if(DeptDelete.deptdelete(num)) {
			response.sendRedirect("startView.jsp");	
		}else {
			response.sendRedirect("failView.jsp");
		}
	}
	private void update(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String Deptno = request.getParameter("DEPTNO");
		String Dname = request.getParameter("DNAME");
		String Loc = request.getParameter("LOC");
		int num=0;
		try {
			num = Integer.parseInt(Deptno);
			if(Dname.length()==0|Loc.length()==0) {
				response.sendRedirect("NotNumber.jsp");
				return;
			}
		}catch(Exception e) {
			response.sendRedirect("NotNumber.jsp");
			return;
		}
		if(DeptUpdate.deptUpdate(num,Dname,Loc)) {
			response.sendRedirect("startView.jsp");	
		}else {
			response.sendRedirect("failView.jsp");
		}	
	}
}
