package com.bridgelabz;

import com.bridgelabz.component.DemoBean;
import com.bridgelabz.component.EmployeeBean;
import com.bridgelabz.controller.HelloRestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Purpose: To Simulate the Hello Spring App
 *
 * @author : SREELIPTA
 * @since 01-12-2021
 */

@SpringBootApplication
public class HelloSpringAppApplication {
    public static final Logger logger = LoggerFactory.getLogger(HelloSpringAppApplication.class);

    public static void main(String[] args) {
        logger.debug("Hello From Bridgelabz");
        ApplicationContext context = SpringApplication.run(HelloSpringAppApplication.class, args);
        DemoBean demoBean = context.getBean(DemoBean.class);
        logger.warn("Demo Bean = " + demoBean);
        logger.warn(String.valueOf(context.getBean(HelloRestController.class)));
        logger.debug("\n** Example Using @Autowired annotation on property ** ");
        EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
        employeeBean.showEmployeeDetails();
    }

}
