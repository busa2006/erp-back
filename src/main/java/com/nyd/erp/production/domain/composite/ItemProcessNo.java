package com.nyd.erp.production.domain.composite;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

import com.nyd.erp.production.domain.base.Item;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Embeddable
public class ItemProcessNo implements Serializable {
	
	@Column(name = "item_no")
	private Long itemNo;
	
	@Column(name = "process_no")
	private Long processNo;
	
	@Builder
    public ItemProcessNo(Long itemNo,Long processNo) {
		this.itemNo = itemNo;
		this.processNo = processNo;
    }
	
}
