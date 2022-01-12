package com.nyd.erp.production.dto.base.warehouseItem;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.nyd.erp.common.model.save.Dto;
import com.nyd.erp.production.domain.base.WarehouseItem;
import com.nyd.erp.production.domain.composite.WarehouseItemNo;

import lombok.Getter;

@Getter
public class WarehouseItemRequestDto implements Dto<WarehouseItem> {
	
	@NotNull(message = "창고는 필수입니다.")
	private Long warehouseNo;
	
	@NotNull(message = "품목은 필수입니다.")
	private Long itemNo;
	
	private Long itemQt;
	
	public WarehouseItem toEntity(){
        return WarehouseItem.builder()
                .warehouseItemNo(
                		WarehouseItemNo.builder()
                		.itemNo(itemNo)
                		.warehouseNo(warehouseNo)
                		.build()
                	  )
                .itemQt(itemQt)
                .build();
    }
}
