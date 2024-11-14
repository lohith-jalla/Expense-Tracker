package com.lohith.ExpenceTracker.Services;

import com.lohith.ExpenceTracker.Repositories.ExpenseRepo;
import com.lohith.ExpenceTracker.Repositories.UserRepo;
import com.lohith.ExpenceTracker.models.Expenses;
import com.lohith.ExpenceTracker.models.User;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;

@Service
public class Services {

    private final UserRepo repo;
    private final ExpenseRepo expRepo;

    public Services(UserRepo repo, ExpenseRepo expRepo) {
        this.repo = repo;
        this.expRepo = expRepo;
    }

    public boolean isUser(String email,String password){
        User realUser=repo.findByEmail(email);
        if(realUser != null && realUser.getPassword().equals(password)){
            return true;
        }
        return false;
    }

    public void createUser(String name ,String email, String password) {
        repo.save(new User(name,email, password));
    }

    // Expenses Start Here *********************************************

    public void CreateExpense(String desc, LocalDate date, Double amount, String type){
        expRepo.save(new Expenses(desc,date,amount,type));
    }

    public Expenses ExistExpense(Long id){
         return expRepo.findById(id).get();
    }

    public boolean UpdateExpense(Long id,String desc,Double amount,String type){
        Expenses e = ExistExpense(id);
        if(e != null) {
            e.setDescription(desc);
            e.setDate(LocalDate.now());
            e.setAmount(amount);
            e.setType(type);
            return true;
        }
        return false;
    }

    public void DeleteExpense(Long id){
        expRepo.deleteById(id);
    }

}
