package com.student.management.dto;

import com.student.management.model.Address;
import com.student.management.model.Teacher;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Data
@Builder
public class StudentDto {
    private String name;
    private int age;
    private Address address;



}
