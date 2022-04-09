package helper;

import database.EmployeeQuery;
import entities.Employee;

import java.util.List;

public class EmployeeCrud {

    protected Employee employee = new Employee();
    protected EmployeeQuery employeeQuery = new EmployeeQuery();
    protected List<Employee> resultsEmployee;

    // no-argument constructor
    public EmployeeCrud() { }

    public void insertEmployee(int idEmployee, String firstName, String lastName, String email, String phoneNumber, String address, float salary, String birthDate, int idCompany) {
        Boolean result = employeeQuery.addEmployee(idEmployee, firstName, lastName, email, phoneNumber, address, salary, birthDate, idCompany);

        if ( result == true )
            System.out.println(" Employee Added ");
        else
            System.out.println(" Employee NOT Added ");
    }

    public void getAllEmployees() {
        resultsEmployee = employeeQuery.getAllEmployees();
        for (Employee emp : resultsEmployee) {
            System.out.print(emp.getIdEmployee()+" - ");
            System.out.print(emp.getFirstName()+" - ");
            System.out.print(emp.getLastName()+" - ");
            System.out.print(emp.getEmail()+" - ");
            System.out.print(emp.getPhoneNumber()+" - ");
            System.out.println(emp.getAddress()+" - ");
            System.out.print(emp.getSalary()+" - ");
            System.out.print(emp.getBirthDate()+" - ");
            System.out.print(emp.getIdCompany()+"\n");
        }
    }

    public void findEmployeeById(int idEmployee) {
        employee = employeeQuery.getEmployeeById(idEmployee);
        if(employee != null){
            System.out.print(employee.getIdEmployee()+" - ");
            System.out.print(employee.getFirstName()+" - ");
            System.out.print(employee.getLastName()+" - ");
            System.out.print(employee.getEmail()+" - ");
            System.out.print(employee.getPhoneNumber()+" - ");
            System.out.println(employee.getAddress()+" - ");
            System.out.print(employee.getSalary()+" - ");
            System.out.print(employee.getBirthDate()+" - ");
            System.out.print(employee.getIdCompany()+"\n");
        } else {
            System.out.println("No employee found with id: "+ idEmployee);
        }
    }

    public void findEmployeeByFirstName(String firstName) {
        resultsEmployee = employeeQuery.getEmployeeByFirstName(firstName);
        for (Employee emp : resultsEmployee) {
            System.out.print(emp.getIdEmployee()+" - ");
            System.out.print(emp.getFirstName()+" - ");
            System.out.print(emp.getLastName()+" - ");
            System.out.print(emp.getEmail()+" - ");
            System.out.print(emp.getPhoneNumber()+" - ");
            System.out.println(emp.getAddress()+" - ");
            System.out.print(emp.getSalary()+" - ");
            System.out.print(emp.getBirthDate()+" - ");
            System.out.print(emp.getIdCompany()+"\n");
        }
    }


    public void findEmployeeByLastName(String lastName) {
        resultsEmployee = employeeQuery.getEmployeeByLastName(lastName);
        for (Employee emp : resultsEmployee) {
            System.out.print(emp.getIdEmployee()+" - ");
            System.out.print(emp.getFirstName()+" - ");
            System.out.print(emp.getLastName()+" - ");
            System.out.print(emp.getEmail()+" - ");
            System.out.print(emp.getPhoneNumber()+" - ");
            System.out.println(emp.getAddress()+" - ");
            System.out.print(emp.getSalary()+" - ");
            System.out.print(emp.getBirthDate()+" - ");
            System.out.print(emp.getIdCompany()+"\n");
        }
    }

    public void updateEmployee(int idEmployee, String firstName, String lastName, String email, String phoneNumber, String address, float salary, String birthDate, int idCompany) {
        Boolean result = employeeQuery.updateEmployee(idEmployee, firstName,lastName,email,phoneNumber,address,salary,birthDate,idCompany);
        if ( result == true )
            System.out.println(" Employee Updated ");
        else
            System.out.println(" Employee NOT Updated ");
    }

    public void deleteEmployee(int idEmployee) {
        int result = employeeQuery.deleteEmployee(idEmployee);

        if ( result == 1 )
            System.out.println(" Employee Deleted ");
        else
            System.out.println(" Employee NOT Deleted ");
    }
}
