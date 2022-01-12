package com.nyd.erp.production.domain.base;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.nyd.erp.production.domain.composite.ItemProcessNo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class ItemProcess implements Serializable {
	
	@EmbeddedId
	private ItemProcessNo itemProcessNo;
	
	@Builder
    public ItemProcess(ItemProcessNo itemProcessNo) {
		this.itemProcessNo = itemProcessNo;
    }
}