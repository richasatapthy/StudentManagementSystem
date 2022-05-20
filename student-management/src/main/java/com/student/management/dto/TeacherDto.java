package com.student.management.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Email;
@Data
@Builder
public class TeacherDto {

    private String name;

    private String email;

    private Long phoneNumber;

}

