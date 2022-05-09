package com.company.MonthAndMath.repository;

import com.company.MonthAndMath.models.Month;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MonthRepository extends JpaRepository<Month, Integer> {
    List<Month> findAllMonthsById(Integer number);
}
