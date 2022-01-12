package com.nyd.erp.production.dto.production.order;

import com.nyd.erp.production.domain.production.ProductionOrder;

import lombok.Getter;

@Getter
public class ProductionOrderResponseDto {
	private Long orderNo;
	private Long itemNo;
	private Long orderQt;
	
	public ProductionOrderResponseDto(ProductionOrder productionOrder) {
        this.orderNo = productionOrder.getOrderNo();
        this.itemNo = productionOrder.getItem().getItemNo();        
        this.orderQt = productionOrder.getOrderQt();
    }
}
