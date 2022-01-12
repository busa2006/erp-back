package com.nyd.erp.production.domain.base;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.nyd.erp.production.domain.composite.WarehouseItemNo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class WarehouseItem implements Serializable {
	@EmbeddedId
	private WarehouseItemNo warehouseItemNo;
	private Long itemQt;
	
	@Builder
    public WarehouseItem(WarehouseItemNo warehouseItemNo,Long itemQt) {
		this.warehouseItemNo = warehouseItemNo;
		this.itemQt = itemQt;
    }
}