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
public class ProcessItemNo implements Serializable {
	
	@Column(name = "process_no")
	private Long processNo;
	
	@Column(name = "item_no")
	private Long itemNo;
	
	@Builder
    public ProcessItemNo(Long processNo, Long itemNo) {
		this.processNo = processNo;
		this.itemNo = itemNo;
    }
	
}
