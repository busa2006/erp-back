package com.nyd.erp.production.dto.base.item;

import com.nyd.erp.production.domain.base.Item;

import lombok.Getter;

@Getter
public class ItemResponseDto {
	private Long itemNo;
	private String itemNm;
	
	public ItemResponseDto(Item item) {
        this.itemNo = item.getItemNo();
        this.itemNm = item.getItemNm();
    }
}
