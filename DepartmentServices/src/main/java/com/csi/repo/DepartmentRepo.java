package com.csi.repo;

import com.csi.model.Department;
import org.springframework.beans.factory.parsing.EmptyReaderEventListener;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {
}
