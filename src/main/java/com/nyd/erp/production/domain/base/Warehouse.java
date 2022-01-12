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
public class Warehouse {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long warehouseNo;
	private String warehouseNm;
	
	@Builder
    public Warehouse(Long warehouseNo,String warehouseNm) {
		this.warehouseNo = warehouseNo;
		this.warehouseNm = warehouseNm;
    }
	
}