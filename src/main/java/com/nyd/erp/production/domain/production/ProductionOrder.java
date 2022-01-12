package com.nyd.erp.production.domain.production;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.nyd.erp.production.domain.base.Item;
import com.nyd.erp.production.domain.base.ItemProcess;
import com.nyd.erp.production.domain.composite.ItemProcessNo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class ProductionOrder {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderNo;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "item_no")
	private Item item;
	private Long orderQt;
	
	@Builder
    public ProductionOrder(Long orderNo,Item item,Long orderQt) {
		this.orderNo = orderNo;
		this.item = item;
		this.orderQt = orderQt;
    }
}
