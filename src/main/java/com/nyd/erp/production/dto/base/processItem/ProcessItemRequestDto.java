package com.nyd.erp.production.dto.base.processItem;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.nyd.erp.common.model.save.Dto;
import com.nyd.erp.production.domain.base.ProcessItem;
import com.nyd.erp.production.domain.composite.ProcessItemNo;

import lombok.Getter;

@Getter
public class ProcessItemRequestDto implements Dto<ProcessItem> {
	
	@NotNull(message = "공정은 필수입니다.")
	private Long processNo;
	@NotNull(message = "품목은 필수입니다.")
	private Long itemNo;
	private Long itemQt;
	public ProcessItem toEntity(){
        return ProcessItem.builder()
                .processItemNo(
                		ProcessItemNo.builder()
                		.processNo(processNo)
                		.itemNo(itemNo)
                		.build()
                	  )
                .itemQt(itemQt)
                .build();
    }
}
