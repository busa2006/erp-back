package com.nyd.erp.production.domain.base;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Process {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long processNo;
	private String processNm;
	
	@Builder
    public Process(Long processNo,String processNm) {
		this.processNo = processNo;
		this.processNm = processNm;
    }
}
