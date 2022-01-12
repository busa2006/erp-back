package com.nyd.erp.production.dto.base.warehouseItem;

import com.nyd.erp.production.domain.base.WarehouseItem;

import lombok.Builder;
import lombok.Getter;

@Getter
public class WarehouseItemResponseDto {
	
	private Long warehouseNo;
	private Long itemNo;
	private Long itemQt;
	
	public WarehouseItemResponseDto(WarehouseItem itemWarehouse) {
		this.warehouseNo = itemWarehouse.getWarehouseItemNo().getWarehouseNo();
		this.itemNo = itemWarehouse.getWarehouseItemNo().getItemNo();
		this.itemQt = itemWarehouse.getItemQt();
    }
}
