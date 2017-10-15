package cn.niyulu.factory;

import cn.niyulu.service.IAdminService;
import cn.niyulu.service.impl.AdminServiceImpl;

public class ServiceFactory {
	public static IAdminService getIAdminServiceInstance(){
		return new AdminServiceImpl();
	}
}
