package wicode.hr.HrAssociationRESTAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import wicode.hr.HrAssociationRESTAPI.Entity.Employee;
import wicode.hr.HrAssociationRESTAPI.Entity.Sexe;
import wicode.hr.HrAssociationRESTAPI.Repository.EmployeeRepository;

import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class HrAssociationRestapiApplication {

	@Autowired
	EmployeeRepository employeeRepository;

	private  void  AddOneEmployee(){

	}


	@Bean
	CommandLineRunner start(){
		return  args -> {
			employeeRepository.save(
					new Employee(null,"Ho-12","Honyiglo","Wilfried", LocalDate.of(2000,11,20), Sexe.Masculin)
			);
			employeeRepository.save(
					new Employee(null,"Dvd-12","SOGBO","jvdj", LocalDate.of(2000,11,20), Sexe.Masculin)
			);
			employeeRepository.save(
					new Employee(null,"dvnd-12","ANDJAO","Julie", LocalDate.of(2000,11,20), Sexe.Feminin)
			);
			employeeRepository.save(
					new Employee(null,"sojs-12","ANANI","Caleb", LocalDate.of(2000,11,20), Sexe.Masculin)
			);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(HrAssociationRestapiApplication.class, args);

	}

}
