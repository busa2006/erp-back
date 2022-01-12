package com.nyd.erp.production.dto.base.processItem;

import com.nyd.erp.production.domain.base.ProcessItem;

import lombok.Getter;

@Getter
public class ProcessItemResponseDto {
	private Long processNo;
	private Long itemNo;
	private Long itemQt;
	public ProcessItemResponseDto(ProcessItem processItem) {
        this.processNo = processItem.getProcessItemNo().getProcessNo();
        this.itemNo = processItem.getProcessItemNo().getItemNo();
        this.itemQt = processItem.getItemQt();
    }
}
