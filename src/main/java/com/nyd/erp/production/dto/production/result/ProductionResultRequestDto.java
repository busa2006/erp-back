package com.nyd.erp.production.dto.production.result;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.nyd.erp.common.model.save.Dto;
import com.nyd.erp.production.domain.production.ProductionOrder;
import com.nyd.erp.production.domain.production.ProductionResult;

import lombok.Getter;

@Getter
public class ProductionResultRequestDto implements Dto<ProductionResult>{
	
	private Long resultNo;
	@NotNull(message = "생산지시는 필수입니다.")
	@Min(value=1, message = "생산지시가 존재해야 합니다.")
	private Long orderNo;
	@NotNull(message = "실적수량은 필수입니다.")
	@Min(value=1, message = "실적수량은 존재해야 합니다.")
	private Long resultQt;
	
	public ProductionResult toEntity(){
        return ProductionResult.builder()
        		.resultNo(resultNo)
        		.order(ProductionOrder.builder().orderNo(orderNo).build())
                .resultQt(resultQt)
                .build();
    }
}
