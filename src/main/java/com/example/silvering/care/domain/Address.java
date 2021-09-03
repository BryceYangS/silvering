package com.example.silvering.care.domain;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class Address {
	private String sido; // 시,도
	private String siGunGu; // 시, 군, 구
}
