package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.DBUtil;

public class DeptDelete {
	public static boolean deptdelete(int deptno) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rset = null;
		ArrayList<DeptDTO> arr=null;
		try {
				conn = DBUtil.getConnection();
				pstmt = conn.prepareStatement("delete from dept where DEPTNO=?");
				pstmt.setInt(1, deptno);
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
