package com.example.demo.BankDemoPP.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KpiPP {

    @Id @GeneratedValue
    private Long id;

    private int credit;

    public KpiPP(int credit) {
        this.credit = credit;
    }
}
