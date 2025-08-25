package basedev.CRUD_psql.EmployeeCRUD.service;

import java.util.List;

import jakarta.annotation.Resource;

import org.springframework.stereotype.Service;

import basedev.CRUD_psql.EmployeeCRUD.dao.EmployeeDao;
import basedev.CRUD_psql.EmployeeCRUD.entity.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Resource 
	EmployeeDao employeeDao;
	@Override
	public List<Employee> findAll() {
		return employeeDao.findAll();
	}
	@Override
	public void insertEmployee(Employee emp) {
		employeeDao.insertEmployee(emp);
		
	}
	@Override
	public void updateEmployee(Employee emp) {
		employeeDao.updateEmployee(emp);
		
	}
	@Override
	public void executeUpdateEmployee(Employee emp) {
		employeeDao.executeUpdateEmployee(emp);
		
	}

	@Override
	public void deleteEmployee(Employee emp) {
		employeeDao.deleteEmployee(emp);
		
	}
}
