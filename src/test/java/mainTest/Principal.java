package mainTest;


import entities.Employee;
import helper.CompanyCrud;
import helper.EmployeeCrud;

public class Principal {

    protected static CompanyCrud companyCrud = new CompanyCrud();
    protected static EmployeeCrud employeeCrud = new EmployeeCrud();

    public static void main(String[] args)
    {

       // companyCrud.getAllCompanies();
       // companyCrud.findCompanyId(3);
       // companyCrud.findCompanyName("Exito");
       // companyCrud.insertCompany(8, "Carrefur", "5893242", "carrefur@gmail.com", "14 trash rd.");
       // companyCrud.updateCompany(8, "Jumbo", "789624", "jumbo@gmail.com", "27 trash rd.");
       // companyCrud.deleteCompany(8);

        // Traer todos los registros de la tabla Employee
        //employeeCrud.getAllEmployees();

        // Buscar empleados por apellido
        //employeeCrud.findEmployeeByLastName("Gonzalez");

        // Insertar un nuevo empleado en la tabla Employee
        //employeeCrud.insertEmployee(100, "Juanito","Alimaña","juanito@alimana.com","3105554433","Calle 3 # 2-1", 666500,"2022-01-21",4);
        //employeeCrud.findEmployeeByLastName("Alimaña");

        // Modificar un registro de la tabla Employee
        //employeeCrud.updateEmployee(100, "Pedro","Navaja","pedro@navaja.com","123456789","Carrera 0 #0 - 0",999,"1990-12-12",5);
        //employeeCrud.findEmployeeByLastName("Navaja");

        // Eliminar un registro de la tabla Employee
        employeeCrud.deleteEmployee(100);
        employeeCrud.findEmployeeById(100);
    }
}
