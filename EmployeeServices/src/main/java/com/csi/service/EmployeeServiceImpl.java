package com.csi.service;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import com.csi.vo.Department;
import com.csi.vo.RestTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl {

    @Autowired
    EmployeeRepo employeeRepoImpl;

    @Autowired
    FeignClientService feignClientService;


    public Employee saveData(Employee employee) {

        return employeeRepoImpl.save(employee);
    }

    public RestTemplateVO getDataById(int empId) {

        RestTemplateVO restTemplateVO = new RestTemplateVO();

        Employee employee= employeeRepoImpl.findByEmpId(empId);

        Department department = feignClientService.getDepartmentById(employee.getDeptId());

        restTemplateVO.setEmployee(employee);
        restTemplateVO.setDepartment(department);

        return restTemplateVO;
    }
}
