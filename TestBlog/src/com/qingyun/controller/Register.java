package com.qingyun.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.qingyun.dao.imp.BlogUserImp;
import com.qingyun.entity.*;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String un = req.getParameter("username");
		String pwd = req.getParameter("password");	
		
		User user = new User(un, pwd);
		
		BlogUserImp blogUserImp = new BlogUserImp();
		boolean isSuccess = blogUserImp.register(user);
		
		if (isSuccess) {
			// 重定向			
			resp.sendRedirect("login.html");
		}else {
			resp.sendRedirect("register.html");
		}
	}
}
