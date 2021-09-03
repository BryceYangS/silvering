package com.example.silvering.care.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
public class Caregiver {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private int age;

	@Embedded
	private Address location;
}
