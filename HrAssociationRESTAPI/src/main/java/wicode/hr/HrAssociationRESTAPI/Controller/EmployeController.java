package wicode.hr.HrAssociationRESTAPI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wicode.hr.HrAssociationRESTAPI.Entity.Employee;
import wicode.hr.HrAssociationRESTAPI.Entity.Sexe;
import wicode.hr.HrAssociationRESTAPI.Service.EmployeService;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeController {
    @Autowired
    EmployeService employeService;

    @GetMapping("/")
    public List<Employee> showEmployee(){
        return employeService.getEmployes();
    }

    @GetMapping("/sexe/{sexe}")
    public List<Employee> getByEmployee(@PathVariable Sexe sexe){
        return employeService.getEmployeBySexe(sexe);
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeService.addEmploye(employee);
    }






}
