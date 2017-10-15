package cn.niyulu.factory;

import java.sql.Connection;

import cn.niyulu.dao.IAdminDAO;
import cn.niyulu.dao.impl.AdminDAOImpl;

public class DAOFactory {
	public static IAdminDAO getIAdminDAOInstace(Connection conn){
		return new AdminDAOImpl(conn);
	}
}
