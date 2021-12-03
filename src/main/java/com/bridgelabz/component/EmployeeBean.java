package com.bridgelabz.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Purpose : To demonstrate dependency injection
 *
 * @author SREELIPTA
 * @since 02-12-2021
 */
@Component
public class EmployeeBean {

    public static final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);
    @Value("104")
    private int employeeId;
    @Value("Spring Framework Guru")
    private String employeeName;
    @Autowired
    private DepartmentBean departmentBean;

    public EmployeeBean() {
    }

    /**
     * Purpose : This constructor is used for @Autowired on constructor
     *
     * @param departmentBean : takes DepartmentBean object as parameter to inject dependency on constructor level
     */
    @Autowired
    public EmployeeBean(DepartmentBean departmentBean) {
        logger.trace("** Autowiring by using @Autowired annotation on constructor ** ");
        this.departmentBean = departmentBean;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public DepartmentBean getDepartmentBean() {
        return departmentBean;
    }

    /**
     * Purpose : This Setter method is used for @Autowired on setter
     *
     * @param departmentBean : takes DepartmentBean object as parameter to inject dependency on Setter
     */
    @Autowired
    public void setDepartmentBean(DepartmentBean departmentBean) {
        logger.trace("** Autowiring by using @Autowired annotation on setter **");
        this.departmentBean = departmentBean;
    }

    /**
     * Purpose : To show the employee details
     */
    public void showEmployeeDetails() {
        logger.debug("Employee Id : {}", employeeId);
        logger.debug("Employee Name : {}", employeeName);
        logger.debug("Department : {}", departmentBean.getDepartmentName());
    }
}
