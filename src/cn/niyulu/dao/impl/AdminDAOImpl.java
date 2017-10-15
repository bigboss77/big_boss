package cn.niyulu.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.niyulu.dao.IAdminDAO;
import cn.niyulu.vo.Admin;

public class AdminDAOImpl implements IAdminDAO<String, Admin> {

	private Connection conn  = null;
	private PreparedStatement  pstmt = null;
	private ResultSet rs = null;
	public AdminDAOImpl(Connection conn) {
		this.conn = conn;
	}
	@Override
	public boolean findLogin(Admin vo) throws SQLException {
		boolean flag = false;
		String sql = "select aid from admin where aid=? and password=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getAid());
		pstmt.setString(2, vo.getPassword());
		rs = pstmt.executeQuery();
		if(rs.next()){
			vo.setAid(rs.getString(1)); // 将名称返回到页面中
			flag = true;
		}
		return flag ;
	}

}
