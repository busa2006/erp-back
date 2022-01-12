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
import com.nyd.erp.production.domain.base.ItemProcess;
import com.nyd.erp.production.dto.base.itemProcess.ItemProcessRequestDto;
import com.nyd.erp.production.dto.base.itemProcess.ItemProcessResponseDto;
import com.nyd.erp.production.service.base.ItemProcessService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/itemProcess")
public class ItemProcessController {
	
	private final ItemProcessService bomService;
	private final ResponseService responseService;
	
	@GetMapping
	public ListResult<ItemProcessResponseDto> findAll() {
		return responseService.getListResult(bomService.findAll()); 
	}
	
	@PostMapping
	public CommonResult save(@RequestBody @Valid SaveData<ItemProcessRequestDto,ItemProcess> bomSaveData) {
		bomService.save(bomSaveData);
		return responseService.getSuccessResult();
	}
}
