package com.nyd.erp.production.domain.production;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.nyd.erp.production.domain.base.Warehouse;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class ProductionRelease {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long releaseNo;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "warehouse_no")
	private Warehouse warehouse;
	private Long releaseQt;
	
	@Builder
    public ProductionRelease(Long releaseNo,Warehouse warehouse,Long releaseQt) {
		this.releaseNo = releaseNo;
		this.warehouse = warehouse;
		this.releaseQt = releaseQt;
    }
	
}
