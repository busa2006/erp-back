package com.nyd.erp.production.domain.composite;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

import com.nyd.erp.production.domain.base.Item;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Embeddable
public class WarehouseItemNo implements Serializable {
	

	@Column(name = "warehouse_no")
	private Long warehouseNo;
	
	@Column(name = "item_no")
	private Long itemNo;
	
	
	@Builder
    public WarehouseItemNo(Long warehouseNo, Long itemNo) {
		this.warehouseNo = warehouseNo;
		this.itemNo = itemNo;
    }
	
}
