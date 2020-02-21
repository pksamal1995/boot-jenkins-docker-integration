package jenkins.docker.bootjenkinsdockerintegration;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootJenkinsDockerIntegrationApplication {

	@GetMapping("/message")
	public ResponseEntity<List<Employee>> getMessage() {
		List<Employee> employees = Arrays.asList(
				new Employee[] { new Employee(1, "Sudheer"), new Employee(2, "Rani"), new Employee(3, "Sonali") });
		return new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
	}

	public static void main(String[] args) {
		SpringApplication.run(BootJenkinsDockerIntegrationApplication.class, args);
	}

	static class Employee {
		int id;
		String name;

		Employee(int id, String name) {
			this.id = id;
			this.name = name;
		}
	}
}
