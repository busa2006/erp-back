package com.nyd.erp.production.dto.base.warehouse;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.nyd.erp.common.model.save.Dto;
import com.nyd.erp.production.domain.base.Warehouse;

import lombok.Getter;

@Getter
public class WarehouseRequestDto implements Dto<Warehouse>{
	
	private Long warehouseNo;
	@NotBlank(message = "창고명은 필수입니다.")
	@Size(min = 1, max = 20, message = "창고명은 1 ~ 20자 이여야 합니다.") 
	private String warehouseNm;
	public Warehouse toEntity(){
        return Warehouse.builder()
        		.warehouseNo(warehouseNo)
                .warehouseNm(warehouseNm)
                .build();
    }
}
