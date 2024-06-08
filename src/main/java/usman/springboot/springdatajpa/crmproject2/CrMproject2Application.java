package usman.springboot.springdatajpa.crmproject2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import usman.springboot.springdatajpa.crmproject2.model.studentinfo;
import usman.springboot.springdatajpa.crmproject2.service.ICustomerService;

@SpringBootApplication
public class CrMproject2Application {

    public static void main(String[] args) {
        SpringApplication.run(CrMproject2Application.class, args);

    }

}
