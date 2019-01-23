package com.qingyun.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qingyun.dao.imp.BlogImp;

/**
 * Servlet implementation class DeleteBlog
 */
@WebServlet("/DeleteBlog")
public class DeleteBlog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteBlog() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		BlogImp bImp = new BlogImp();
		boolean isSuccess =  bImp.deleteBlog(Integer.valueOf(id));
		if (isSuccess) {
			resp.getWriter().write("1");
		}else {
			resp.getWriter().write("0");
		}
		
		
	}
}
