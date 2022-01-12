package com.nyd.erp.human.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Dept {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long depteNo;
	private String deptNm;
}

