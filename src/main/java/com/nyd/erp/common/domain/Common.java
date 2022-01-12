package com.nyd.erp.common.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Common {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long commonNo;
	private String commonNm;
}