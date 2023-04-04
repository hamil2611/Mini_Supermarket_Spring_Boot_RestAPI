package com.example.managestore.entity.employee;

import com.example.managestore.enumApp.PayslipStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Entity
@Table(name = "payslip")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Payslip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "total_hours")
    private Float totalHours;
    @Column(name = "salary")
    private Float salary;
    @Column(name = "note")
    private String note;
    @Column(name = "status")
    private PayslipStatus status;
    @Column(name = "created_date")
    private LocalDateTime createdDate;
    @Column(name = "last_updated")
    private LocalDateTime lastUpdated;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

}
