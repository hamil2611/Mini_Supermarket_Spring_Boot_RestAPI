package com.example.managestore.entity.employee;

import com.example.managestore.entity.bases.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "shift")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Shift{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name_shift")
    private String nameShift;
    @Column(name = "time_shift")
    private LocalDateTime timeShift;
    @Column(name = "note")
    private String note;
    @Column(name = "created_date")
    private LocalDateTime createdDate;
    @Column(name = "last_updated")
    private LocalDateTime lastUpdated;
    @Column(name = "number_of_hours")
    private int numberOfHours;

    @ManyToMany(mappedBy = "shifts", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Employee> employees;

}
