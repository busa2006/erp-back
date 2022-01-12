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
public class Item {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long itemNo;
	private String itemNm;
	
	@Builder
    public Item(Long itemNo,String itemNm) {
		this.itemNo = itemNo;
		this.itemNm = itemNm;
    }
	
}