import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.krishantha.training.salesmanager.repository.EmployeeRepository;
import com.krishantha.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import com.krishantha.training.salesmanager.service.EmployeeService;
import com.krishantha.training.salesmanager.service.EmployeeServiceImpl;

@Configuration
@ComponentScan("com.krishantha")
@PropertySource("application.properties")
public class ApplicationConfiguration {
	
	@Bean(name="employeeService")
	//@Scope("singleton")
	@Scope("prototype")
	public EmployeeService getEmployeeService() {
		
		EmployeeServiceImpl employeeService=new EmployeeServiceImpl();
		return employeeService;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	/*
	 * @Bean(name="employeeRepository") public EmployeeRepository
	 * getEmployeeRepository() { return new HibernateEmployeeRepositoryImpl(); }
	 */	

}
