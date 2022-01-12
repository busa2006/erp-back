package com.nyd.erp.production.domain.base;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.nyd.erp.production.domain.composite.ProcessItemNo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class ProcessItem implements Serializable {
	@EmbeddedId
	private ProcessItemNo processItemNo;
	private Long itemQt;
	
	@Builder
    public ProcessItem(ProcessItemNo processItemNo,Long itemQt) {
		this.processItemNo = processItemNo;
		this.itemQt = itemQt;
    }
}