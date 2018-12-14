package cn.k12soft.servo.module.charge.repository;

import cn.k12soft.servo.module.charge.domain.ChargePlan;

import java.time.Instant;
import java.util.List;
import cn.k12soft.servo.module.expense.domain.ExpenseEntry;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChargePlanRepository extends JpaRepository<ChargePlan, Integer> {
    Page<ChargePlan> findAllBySchoolIdAndCreateAtAfter(int schoolId, Instant createAt, Pageable pageable);

    void deleteByExpenseEntry(ExpenseEntry entry);
}