package com.example.JobSearchPortal.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
@Entity
public class Job {
    @Id
    private Long id;

    @NotBlank
    private String title;

    @NotBlank
    private String description;

    @NotBlank
    private String location;

    @NotNull
    @Min(value = 20000, message = "Salary should be above 20,000")
    private Double salary;

    @NotBlank
    @Email
    private String companyEmail;
    @NotBlank
    private String companyName;

    @NotBlank
    private String employerName;

    @Enumerated(EnumType.STRING)
    private JobType jobType;

    @NotNull
    private LocalDate appliedDate;
}
