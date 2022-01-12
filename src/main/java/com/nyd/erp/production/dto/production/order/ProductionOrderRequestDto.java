package com.nyd.erp.production.dto.production.order;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.nyd.erp.common.model.save.Dto;
import com.nyd.erp.production.domain.base.Item;
import com.nyd.erp.production.domain.production.ProductionOrder;

import lombok.Getter;

@Getter
public class ProductionOrderRequestDto implements Dto<ProductionOrder>{
	
	private Long orderNo;
	@NotNull(message = "품목은 필수입니다.")
	@Min(value=1, message = "품목이 존재해야 합니다.")
	private Long itemNo;
	@NotNull(message = "지시수량은 필수입니다.")
	@Min(value=1, message = "지시수량이 존재해야 합니다.")
	private Long orderQt;
	
	public ProductionOrder toEntity(){
        return ProductionOrder.builder()
        		.orderNo(orderNo)
        		.item(Item.builder().itemNo(itemNo).build())
                .orderQt(orderQt)
                .build();
    }
}
