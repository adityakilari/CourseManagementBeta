package in.aditya.cmp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"in.aditya.cms.controller", "in.aditya.cmp.service", "in.aditya.cmp.serviceImplimentation"})
public class CourseManagemtBetaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseManagemtBetaApplication.class, args);
	}

}
