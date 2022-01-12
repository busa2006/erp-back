package com.nyd.erp.production.domain.production;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.nyd.erp.production.domain.base.Item;
import com.nyd.erp.production.domain.base.Warehouse;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class ProductionReceive {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long receiveNo;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "result_no")
	private ProductionResult result;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "warehouse_no")
	private Warehouse warehouse;
	private Long receiveQt;
	
	@Builder
    public ProductionReceive(Long receiveNo,ProductionResult result,Warehouse warehouse,Long receiveQt) {
		this.receiveNo = receiveNo;
		this.result = result;
		this.warehouse = warehouse;
		this.receiveQt = receiveQt;
    }
	
}

