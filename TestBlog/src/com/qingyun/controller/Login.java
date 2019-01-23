package com.qingyun.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qingyun.dao.imp.BlogUserImp;
import com.qingyun.entity.User;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String un = req.getParameter("username");
		String pwd = req.getParameter("password");	
		
		User user = new User(un, pwd);
		BlogUserImp bui = new BlogUserImp();
		
		boolean isSuccess = bui.login(user);
		if (isSuccess) {
			resp.sendRedirect("admin.html");
		}else {
			resp.sendRedirect("login.html");
		}
	}
}
