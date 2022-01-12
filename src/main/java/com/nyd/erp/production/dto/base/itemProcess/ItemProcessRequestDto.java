package com.nyd.erp.production.dto.base.itemProcess;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.nyd.erp.common.model.save.Dto;
import com.nyd.erp.production.domain.base.ItemProcess;
import com.nyd.erp.production.domain.composite.ItemProcessNo;

import lombok.Getter;

@Getter
public class ItemProcessRequestDto implements Dto<ItemProcess> {
	
	@NotNull(message = "품목은 필수입니다.")
	private Long itemNo;
	@NotNull(message = "작업장은 필수입니다.")
	private Long processNo;
	
	public ItemProcess toEntity(){
        return ItemProcess.builder()
                .itemProcessNo(
                		ItemProcessNo.builder()
                		.itemNo(itemNo)
                		.processNo(processNo)
                		.build()
                	  )
                .build();
    }
}
