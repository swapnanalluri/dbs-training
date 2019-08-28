package com.dbs.emp_mgmt.client;

import com.dbs.emp_mgmt.controller.EmployeeController;
import com.dbs.emp_mgmt.model.Address;
import com.dbs.emp_mgmt.model.BankAccount;
import com.dbs.emp_mgmt.model.Dependent;
import com.dbs.emp_mgmt.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.time.LocalDate;

public class EmpManagementClient {

	private static EmployeeController employeeController;

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		employeeController = applicationContext.getBean(EmployeeController.class);
		saveEmployees();
		// listAllEmployees();
		// fetchEmployeeDetailsById(12);
	}

	private static void fetchEmployeeDetailsById(int i) {
		System.out.println("Employee with id " + i + " is " + employeeController.findById(i));
	}

	private static void listAllEmployees() {
		employeeController.listAll().forEach(System.out::println);
	}

	private static void saveEmployees() {
		Employee employee = new Employee("Harish", LocalDate.of(1985, 5, 25), "HR");

		Dependent dependent1 = new Dependent();
		dependent1.setDepname("mother");
		dependent1.setDage(40);

		Dependent dependent2 = new Dependent();
		dependent2.setDepname("sister");
		dependent2.setDage(20);

		Dependent dependent3 = new Dependent();
		dependent3.setDepname("daddy");
		dependent3.setDage(45);

		Dependent dependent4 = new Dependent();
		dependent4.setDepname("brother");
		dependent4.setDage(25);

		Address address = new Address();
		address.setStreet("18th Main");
		address.setCity("Bangalore");
		address.setState("Karnataka");
		address.setZip("577142");

		BankAccount account1 = new BankAccount();
		account1.setPan("AOY45G88M");
		account1.setAccountBalance(5_000);
		BankAccount account2 = new BankAccount();
		account2.setPan("AOY45GG88M");
		account2.setAccountBalance(15_000);

		employee.addBankAccount(account1);
		employee.addBankAccount(account2);

		employee.setAddress(address);
		address.setEmployee(employee);

		employee.addDependent(dependent1);
		employee.addDependent(dependent2);
		employee.addDependent(dependent3);
		employee.addDependent(dependent4);

		employeeController.saveEmployee(employee);
		// employee = new Employee("VInayak", LocalDate.of(1985,6, 18), "Payroll");
		// employeeController.saveEmployee(employee);
		// employee = new Employee("Harish", LocalDate.of(1981,3, 25), "HR");
		// employeeController.saveEmployee(employee);
	}
}