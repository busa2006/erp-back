package com.nyd.erp.production.dto.base.item;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.nyd.erp.common.model.save.Dto;
import com.nyd.erp.production.domain.base.Item;

import lombok.Getter;

@Getter
public class ItemRequestDto implements Dto<Item>{
	
	private Long itemNo;
	@NotBlank(message = "품목명은 필수입니다.")
	@Size(min = 1, max = 20, message = "품목명은 1 ~ 20자 이여야 합니다.") 
	private String itemNm;
	public Item toEntity(){
        return Item.builder()
        		.itemNo(itemNo)
                .itemNm(itemNm)
                .build();
    }
}
