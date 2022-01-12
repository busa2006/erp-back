package com.nyd.erp.production.dto.production.receive;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.nyd.erp.common.model.save.Dto;
import com.nyd.erp.production.domain.base.Warehouse;
import com.nyd.erp.production.domain.production.ProductionReceive;
import com.nyd.erp.production.domain.production.ProductionResult;

import lombok.Getter;

@Getter
public class ProductionReceiveRequestDto implements Dto<ProductionReceive>{
	
	private Long receiveNo;
	@NotNull(message = "생산실적은 필수입니다.")
	@Min(value=1, message = "생산실적이 존재해야 합니다.")
	private Long resultNo;
	@NotNull(message = "창고는 필수입니다.")
	@Min(value=1, message = "창고는 존재해야 합니다.")
	private Long warehouseNo;
	@NotNull(message = "실적수량은 필수입니다.")
	@Min(value=1, message = "실적수량은 존재해야 합니다.")
	private Long receiveQt;
	
	public ProductionReceive toEntity(){
        return ProductionReceive.builder()
        		.receiveNo(receiveNo)
        		.result(ProductionResult.builder().resultNo(resultNo).build())
        		.warehouse(Warehouse.builder().warehouseNo(warehouseNo).build())
                .receiveQt(receiveQt)
                .build();
    }
}
