package wicode.hr.HrAssociationRESTAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wicode.hr.HrAssociationRESTAPI.Entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


}
