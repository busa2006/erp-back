package com.nyd.erp.production.dto.production.receive;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.nyd.erp.production.domain.production.ProductionReceive;
import com.nyd.erp.production.domain.production.ProductionResult;

import lombok.Getter;

@Getter
public class ProductionReceiveResponseDto {
	private Long receiveNo;
	private Long resultNo;
	private Long resultQt;
	private Long warehouseNo;
	private Long receiveQt;
	
	public ProductionReceiveResponseDto(ProductionReceive productionReceive) {
        this.receiveNo = productionReceive.getReceiveNo();
        this.resultNo = productionReceive.getResult().getResultNo();        
        this.resultQt = productionReceive.getResult().getResultQt();
        this.warehouseNo = productionReceive.getWarehouse().getWarehouseNo();
        this.receiveQt = productionReceive.getReceiveQt();
    }
}
