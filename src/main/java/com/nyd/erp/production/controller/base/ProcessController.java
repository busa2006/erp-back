package com.nyd.erp.production.controller.base;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nyd.erp.common.model.response.CommonResult;
import com.nyd.erp.common.model.response.ListResult;
import com.nyd.erp.common.model.save.SaveData;
import com.nyd.erp.common.service.response.ResponseService;
import com.nyd.erp.production.domain.base.Process;
import com.nyd.erp.production.dto.base.process.ProcessRequestDto;
import com.nyd.erp.production.dto.base.process.ProcessResponseDto;
import com.nyd.erp.production.service.base.ProcessService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/process")
public class ProcessController {
	
	private final ProcessService processService;
	private final ResponseService responseService;
	
	@GetMapping
	public ListResult<ProcessResponseDto> findAll() {
		return responseService.getListResult(processService.findAll()); 
	}
	
	@PostMapping
	public CommonResult save(@RequestBody @Valid SaveData<ProcessRequestDto,Process> processSaveData) {
		processService.save(processSaveData);
		return responseService.getSuccessResult();
	}
}
