package com.company.MonthAndMath.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MathRepository extends JpaRepository<Math, Integer> {


}
