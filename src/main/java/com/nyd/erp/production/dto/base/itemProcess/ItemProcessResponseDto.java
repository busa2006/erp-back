package com.nyd.erp.production.dto.base.itemProcess;

import com.nyd.erp.production.domain.base.ItemProcess;

import lombok.Getter;

@Getter
public class ItemProcessResponseDto {
	
	private Long itemNo;
	private Long processNo;
	public ItemProcessResponseDto(ItemProcess itemProcess) {
		this.itemNo = itemProcess.getItemProcessNo().getItemNo();
        this.processNo = itemProcess.getItemProcessNo().getProcessNo();
    }
}
