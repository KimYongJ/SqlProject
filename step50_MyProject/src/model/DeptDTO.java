package model;

public class DeptDTO {
	private int Deptno;
	private String Dname;
	private String Loc;
	public DeptDTO() {}
	public DeptDTO(int deptno, String dname, String loc) {
		Deptno = deptno;
		Dname = dname;
		Loc = loc;
	}
	public int getDeptno() {
		return Deptno;
	}
	public void setDeptno(int deptno) {
		Deptno = deptno;
	}
	public String getDname() {
		return Dname;
	}
	public void setDname(String dname) {
		Dname = dname;
	}
	public String getLoc() {
		return Loc;
	}
	public void setLoc(String loc) {
		Loc = loc;
	}
	@Override
	public String toString() {
		return "DeptDTO [Deptno=" + Deptno + ", Dname=" + Dname + ", Loc=" + Loc + "]";
	}
}
