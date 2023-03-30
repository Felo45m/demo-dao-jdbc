package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
				
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n=== TEST 1: Department insert =====");
		Department newDepartment = new Department(8, "DTeste");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("\n=== TEST 2: Department update =====");
		Department department = departmentDao.findById(6);
		department.setName("D1");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 3: Department delete =====");
		System.out.println("Enter id for delete test: ");
		int id = 7;
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		System.out.println("=== TEST 4: Department findById ===");
		department = departmentDao.findById(3);		
		System.out.println(department);
		
		System.out.println("\n=== TEST 3: seller findAll =====");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
	}

}
