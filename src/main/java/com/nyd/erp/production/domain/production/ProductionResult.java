package com.nyd.erp.production.domain.production;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.nyd.erp.production.domain.base.Item;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class ProductionResult {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long resultNo;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_no")
	private ProductionOrder order;
	private Long resultQt;
	
	@Builder
    public ProductionResult(Long resultNo,ProductionOrder order,Long resultQt) {
		this.resultNo = resultNo;
		this.order = order;
		this.resultQt = resultQt;
    }
}

