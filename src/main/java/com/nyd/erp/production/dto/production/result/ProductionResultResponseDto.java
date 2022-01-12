package com.nyd.erp.production.dto.production.result;

import com.nyd.erp.production.domain.production.ProductionResult;

import lombok.Getter;

@Getter
public class ProductionResultResponseDto {
	private Long resultNo;
	private Long orderNo;
	private Long orderQt;
	private Long resultQt;
	
	public ProductionResultResponseDto(ProductionResult productionResult) {
        this.resultNo = productionResult.getResultNo();
        this.orderNo = productionResult.getOrder().getOrderNo();        
        this.orderQt = productionResult.getOrder().getOrderQt();
        this.resultQt = productionResult.getResultQt();
    }
}
