package com.qingyun.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.qingyun.entity.*;

import com.qingyun.dao.BlogUserInterface;
import com.qingyun.util.HandlerDBUtil;

public class BlogUserImp implements BlogUserInterface{
	// 查询用户名是否存在
	private boolean isExists(User user) {
		// 获取数据库连接对象
		Connection connection = HandlerDBUtil.getInstance().getConnection();
		String sql = "select * from user_table where username = ?";
		//获取预编译对象
		PreparedStatement preparedStatement = HandlerDBUtil.getInstance().getStatement(connection, sql);
		ResultSet rs = null;
		try {
			preparedStatement.setString(1, user.getUsername());
			rs = preparedStatement.executeQuery();
			while (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			HandlerDBUtil.getInstance().closeDB(connection, preparedStatement,rs);
		}
		return false;
	}
	
	@Override
	public boolean register(User user) {
		if (isExists(user)) {
			return false;
		}
		// 获取数据库连接对象
		Connection connection = HandlerDBUtil.getInstance().getConnection();
		// 编写sql语句
		String sql = "insert into user_table (username, pwd) values (?,?)";
		// 获取预编译对象
		PreparedStatement preparedStatement = HandlerDBUtil.getInstance().getStatement(connection, sql);
		try {
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPwd());
			
			// 执行编译
			int row = preparedStatement.executeUpdate();
			if (row > 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			HandlerDBUtil.getInstance().closeDB(connection, preparedStatement, null);
		}
		return false;
	}
	
	public boolean login(User user) {
		// 获取数据库连接对象
		Connection connection = HandlerDBUtil.getInstance().getConnection();
		String sql = "select * from user_table where username = ? and pwd = ?";
		//获取预编译对象
		PreparedStatement preparedStatement = HandlerDBUtil.getInstance().getStatement(connection, sql);
		ResultSet rs = null;
		try {
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPwd());
			rs = preparedStatement.executeQuery();
			while (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			HandlerDBUtil.getInstance().closeDB(connection, preparedStatement,rs);
		}
		return false;
	}
}
