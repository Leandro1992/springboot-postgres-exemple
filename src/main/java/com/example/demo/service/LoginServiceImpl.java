package com.example.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.example.demo.dao.LoginDao;
import com.example.demo.entity.Login;
@Component
public class LoginServiceImpl implements LoginService{
	@Resource 
	LoginDao loginDao;
	@Override
	public List<Login> findAll() {
		return loginDao.findAll();
	}
	// @Override
	// public void insertEmployee(Employee emp) {
	// 	employeeDao.insertEmployee(emp);
		
	// }
	// @Override
	// public void updateEmployee(Employee emp) {
	// 	employeeDao.updateEmployee(emp);
		
	// }
	// @Override
	// public void executeUpdateEmployee(Employee emp) {
	// 	employeeDao.executeUpdateEmployee(emp);
		
	// }

	// @Override
	// public void deleteEmployee(Employee emp) {
	// 	employeeDao.deleteEmployee(emp);
		
	// }
}