package it.univr.employeemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan({"it.univr.employeemanager.repo.EmployeeRepo"})
@ComponentScan({"it.univr.employeemanager.service.EmployeeService"})
@ComponentScan({"it.univr.employeemanager.EmployeeResouce"})
public class EmployeemanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeemanagerApplication.class, args);
    }

}
