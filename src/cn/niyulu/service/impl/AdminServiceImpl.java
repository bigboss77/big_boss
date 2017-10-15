package cn.niyulu.service.impl;

import cn.niyulu.dbc.DatabaseConnection;
import cn.niyulu.factory.DAOFactory;
import cn.niyulu.service.IAdminService;
import cn.niyulu.vo.Admin;

public class AdminServiceImpl implements IAdminService {
	private DatabaseConnection dbc  = new DatabaseConnection();
	@SuppressWarnings("unchecked")
	@Override
	public boolean login(Admin vo) throws Exception {
		try{
			return DAOFactory.getIAdminDAOInstace(this.dbc.getConn()).findLogin(vo);
		}catch (Exception e) {
			throw e;
		}finally{
			this.dbc.close();
		}
	}

}
