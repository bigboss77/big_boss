package cn.niyulu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.niyulu.factory.ServiceFactory;
import cn.niyulu.vo.Admin;

@SuppressWarnings("serial")

public class AdminLoginServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 1、接收参数
		String aid = req.getParameter("aid");
		String password = req.getParameter("password");
		System.out.println(aid);
		// 2、设置参数
		Admin vo = new Admin();
		vo.setAid(aid);
		vo.setPassword(password);
		String url = ""; // 设置跳转路径
		// 执行检查操作
		try {
			if(ServiceFactory.getIAdminServiceInstance().login(vo)){ // 检查登录成功
				req.getSession().setAttribute("aid", vo.getAid());
				url = "success.jsp";
			}else{ // 登录失败
				url ="login.jsp";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		req.getRequestDispatcher(url).forward(req, resp);
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}
}
