package com.nyd.erp.production.dto.base.process;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.nyd.erp.common.model.save.Dto;
import com.nyd.erp.production.domain.base.Item;
import com.nyd.erp.production.domain.base.Process;

import lombok.Getter;

@Getter
public class ProcessRequestDto implements Dto<Process>{
	
	private Long processNo;
	@NotBlank(message = "공정명은 필수입니다.")
	@Size(min = 1, max = 20, message = "공정명은 1 ~ 20자 이여야 합니다.") 
	private String processNm;
	public Process toEntity(){
        return Process.builder()
        		.processNo(processNo)
                .processNm(processNm)
                .build();
    }
}
