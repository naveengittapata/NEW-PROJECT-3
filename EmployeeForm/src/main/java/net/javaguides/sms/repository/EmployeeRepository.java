package net.javaguides.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.sms.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository <EmployeeEntity,Long>{

}
