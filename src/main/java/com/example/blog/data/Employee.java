package com.example.blog.data;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table
public class Employee {
    @Id
    @Column
    private String employeeId;
    @Column
    private String employeeName;
    @Column
    private int employeeAge;

}
