package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.DBUtil;

public class DeptUpdate {
	public static boolean deptUpdate(int deptno,String dname,String loc) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rset = null;
		ArrayList<DeptDTO> arr=null;
		try {
				conn = DBUtil.getConnection();
				pstmt = conn.prepareStatement("UPDATE dept SET DNAME = ?, LOC = ? WHERE DEPTNO=?");
				pstmt.setString(1, dname);
				pstmt.setString(2, loc);
				pstmt.setInt(3, deptno);
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
