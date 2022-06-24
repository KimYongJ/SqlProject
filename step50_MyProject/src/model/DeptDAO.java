package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.DBUtil;

public class DeptDAO {
	public static ArrayList<DeptDTO> getDept() {
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rset = null;
		ArrayList<DeptDTO> arr=null;
		try {
				conn = DBUtil.getConnection();
				pstmt = conn.prepareStatement("select * from dept");
				rset = pstmt.executeQuery();
				arr=new ArrayList<DeptDTO>();
				while(rset.next()) {
					arr.add(new DeptDTO(rset.getInt(1),rset.getString(2),rset.getString(3)));
				}
			} 
		catch (SQLException e) {e.printStackTrace();}
		finally {
			DBUtil.close(rset, pstmt, conn);
		}
		return arr;
	}
}


 