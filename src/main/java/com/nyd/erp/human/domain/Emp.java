package com.nyd.erp.human.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.nyd.erp.common.domain.CommonList;
import com.nyd.erp.production.domain.base.Process;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Emp {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long empNo;
	private String empNm;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dept_no")
	private Dept dept;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "list_no", insertable = false, updatable = false)
	private CommonList job;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "list_no", insertable = false, updatable = false)
	private CommonList position;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "list_no", insertable = false, updatable = false)
	private CommonList duty;
}
