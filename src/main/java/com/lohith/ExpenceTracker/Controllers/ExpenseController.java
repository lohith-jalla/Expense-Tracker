package com.lohith.ExpenceTracker.Controllers;

import com.lohith.ExpenceTracker.Services.Services;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;


@Controller()
public class ExpenseController {

    Services s;
    public ExpenseController(Services s) {
        this.s = s;
    }

//    create Expense

    @PostMapping("/Create")
    public String PostCreate(Model model,@RequestParam String desc,@RequestParam LocalDate date
            ,@RequestParam Double amount,@RequestParam String type ) {
       s.CreateExpense(desc,date,amount,type);
       return "Create";
    }

    // update Expense

    @PostMapping("/update")
    public String PostUpdate(Model model,@RequestParam Long id,@RequestParam String desc,
                             @RequestParam Double amount,@RequestParam String type ) {
        boolean found=s.UpdateExpense(id,desc,amount,type);
        if(!found) {
            return "Error";
        }
        return "index";
    }

    @GetMapping("/error")
    public String Error() {
        return "Error";
    }

    @PostMapping("/delete")
    public void delete(@RequestParam Long id) {
        s.DeleteExpense(id);
    }

}
