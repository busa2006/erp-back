package com.nyd.erp.production.dto.base.warehouse;

import com.nyd.erp.production.domain.base.Warehouse;

import lombok.Getter;

@Getter
public class WarehouseResponseDto {
	private Long warehouseNo;
	private String warehouseNm;
	
	public WarehouseResponseDto(Warehouse warehouse) {
        this.warehouseNo = warehouse.getWarehouseNo();
        this.warehouseNm = warehouse.getWarehouseNm();
    }
}
