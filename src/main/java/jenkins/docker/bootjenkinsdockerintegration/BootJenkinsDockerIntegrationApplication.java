package jenkins.docker.bootjenkinsdockerintegration;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootJenkinsDockerIntegrationApplication {

	Logger logger = LoggerFactory.getLogger(BootJenkinsDockerIntegrationApplication.class);
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getMessage() {
		
		logger.info("Rest controller invoked for employees");
		
		List<Employee> employees = Arrays.asList(
				new Employee[] { new Employee(1, "Sudheer"), new Employee(2, "Rani"), new Employee(3, "Sonali") });
		return new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
	}

	public static void main(String[] args) {
		SpringApplication.run(BootJenkinsDockerIntegrationApplication.class, args);
	}

	static class Employee {
		
		Logger logger = LoggerFactory.getLogger(Employee.class);
		
		int id;
		String name;

		Employee(int id, String name) {
			logger.info("Employee "+id+" -- "+name+" is getting created...");
			this.id = id;
			this.name = name;
		}
	}
}
