package com.example.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.entity.Login;

public class LoginRowMapper implements RowMapper<Login> {

	@Override
	public Login mapRow(ResultSet rs, int arg1) throws SQLException {
		Login lg = new Login();
		lg.setLoginName(rs.getString("name"));
		lg.setLoginPassword(rs.getString("password"));

        return lg;
	}


}