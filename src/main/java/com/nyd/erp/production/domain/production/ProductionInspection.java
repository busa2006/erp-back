package com.nyd.erp.production.domain.production;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class ProductionInspection {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long inspectionNo;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "result_no")
	private ProductionResult result;
	private Long badQt;
	private Long goodQt;
}
