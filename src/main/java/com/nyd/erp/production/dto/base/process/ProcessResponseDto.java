package com.nyd.erp.production.dto.base.process;

import com.nyd.erp.production.domain.base.Process;

import lombok.Getter;

@Getter
public class ProcessResponseDto {
	private Long processNo;
	private String processNm;
	
	public ProcessResponseDto(Process process) {
        this.processNo = process.getProcessNo();
        this.processNm = process.getProcessNm();
    }
}
