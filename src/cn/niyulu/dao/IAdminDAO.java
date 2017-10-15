package cn.niyulu.dao;

import java.sql.SQLException;

public interface IAdminDAO <String,Admin>{
	/**
	 * 检查登录的用户名和密码是否正确
	 * @param vo 表示要执行检查操作的vo对象
	 * @return 成功返回true,失败返回false
	 * @throws SQLException
	 */
	public boolean findLogin(Admin vo)throws SQLException;
}
