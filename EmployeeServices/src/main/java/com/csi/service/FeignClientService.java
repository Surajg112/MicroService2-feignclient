package com.csi.service;

import com.csi.vo.Department;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "DepartmentServices", url = "http://localhost:9191")
public interface FeignClientService {

    @GetMapping("/departments/{deptId}")
    public Department getDepartmentById(@PathVariable int deptId);
}
