package com.example.springconcepts.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private int empId;
    private String empName;

    @Autowired
    private DepartmentBean deptBean;
    public static final Logger logger=LoggerFactory.getLogger(EmployeeBean.class);
    
    public EmployeeBean(){}

    @Autowired
    public EmployeeBean(DepartmentBean deptBean){
        logger.trace("** Autowiring by using @Autowired annotation on constructor **");
        this.deptBean=deptBean;
    }

    public int getEmpId(){
        return empId;
    }

    public void setEmpId(int empId){
        this.empId=empId;
    }

    public String getEmpName(){
        return empName;
    }

    public void setEmpName(String empName){
        this.empName=empName;
    }

    public DepartmentBean getDeptBean(){
        return deptBean;
    }

    @Autowired
    public void setDeptBean(DepartmentBean deptBean){
        logger.trace("** Autowiring by using @Autowired annotation on Setter **");
        this.deptBean=deptBean;
    }

    public void showEmployeeDetails(){
        logger.debug("Employee Id : {}",empId);
        logger.debug("Employee Name : {}",empName);
        deptBean.setDeptName("Information Technology");
        logger.debug("Department : {}",deptBean.getDeptName());
    }
}
