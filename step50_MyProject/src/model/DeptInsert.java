package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.DBUtil;

public class DeptInsert {
	public static boolean deptInsert(int deptno,String dname,String loc) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rset = null;
		ArrayList<DeptDTO> arr=null;
		try {
				conn = DBUtil.getConnection();
				pstmt = conn.prepareStatement("insert into dept(DEPTNO,DNAME,LOC) values(?,?,?);");
				pstmt.setInt(1, deptno);
				pstmt.setString(2, dname);
				pstmt.setString(3, loc);
				int result = pstmt.executeUpdate();
				if (result == 1) {
					return true;
				}
		}
		catch (SQLException e) {e.printStackTrace();}
		finally {
			DBUtil.close(rset, pstmt, conn);
		}
		return false;
	}
}
