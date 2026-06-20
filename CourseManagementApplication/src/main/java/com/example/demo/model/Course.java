package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {

	@Id
	 private Integer id;
	 private String courseName;
	 private String trainerName;
	 private Integer duration; // days
	 private Double fees;
}
