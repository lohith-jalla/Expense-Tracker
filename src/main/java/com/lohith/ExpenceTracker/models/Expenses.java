package com.lohith.ExpenceTracker.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Entity
@Component
public class Expenses {
    @Id
    private Long id;
    private String description;
    private LocalDate date;
    private Double amount;
    private String type;

    public Expenses(String description,LocalDate date, Double amount, String type) {
        this.description = description;
        this.date = LocalDate.now();
        this.amount = amount;
        this.type = type;
    }

    public Expenses() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
