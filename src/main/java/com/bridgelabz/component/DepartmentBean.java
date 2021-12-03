package com.bridgelabz.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Purpose : To demonstrate dependency injection by using this bean class
 *
 * @author SREELIPTA
 * @since 02-12-2021
 */
@Component
public class DepartmentBean {
    @Value("Information Technology")
    private String departmentName;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
