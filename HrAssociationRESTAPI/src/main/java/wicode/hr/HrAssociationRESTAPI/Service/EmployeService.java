package wicode.hr.HrAssociationRESTAPI.Service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wicode.hr.HrAssociationRESTAPI.Entity.Employee;
import wicode.hr.HrAssociationRESTAPI.Entity.Sexe;
import wicode.hr.HrAssociationRESTAPI.Repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmployeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public  Employee addEmploye(Employee employee) { return employeeRepository.save(employee);}
    public Optional<Employee> findEmploye(Integer id) { return employeeRepository.findById(id);}
    public  void deleteEmploye(int id){ employeeRepository.deleteById(id);}
    public List<Employee> getEmployes(){
        return  employeeRepository.findAll();
    }
    public  List<Employee> getEmployeBySexe(Sexe sexe){
        return  employeeRepository.findAll().stream().filter(x -> x.getSexe() == sexe).toList();
    }




}
