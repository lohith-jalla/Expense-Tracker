package com.lohith.ExpenceTracker.Repositories;

import com.lohith.ExpenceTracker.models.Expenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepo extends JpaRepository<Expenses, Long> {
    Expenses findById(long id);
    void  deleteById(long id);
}
