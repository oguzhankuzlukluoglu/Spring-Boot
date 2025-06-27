package com.example.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "student")
@Data //getter and setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="first_name" , nullable=false)
    private String firstName;

    @Column(name="last_name" , nullable=false)
    private String lastName;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name="birth_of_date" , nullable=true)
    private Date birthOfDate;
}
