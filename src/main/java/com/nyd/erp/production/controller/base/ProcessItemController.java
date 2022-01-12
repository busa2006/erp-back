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
import com.nyd.erp.production.domain.base.ProcessItem;
import com.nyd.erp.production.dto.base.processItem.ProcessItemRequestDto;
import com.nyd.erp.production.dto.base.processItem.ProcessItemResponseDto;
import com.nyd.erp.production.service.base.ProcessItemService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/processItem")
public class ProcessItemController {
	
	private final ProcessItemService processItemService;
	private final ResponseService responseService;
	
	@GetMapping
	public ListResult<ProcessItemResponseDto> findAll() {
		return responseService.getListResult(processItemService.findAll()); 
	}
	
	@PostMapping
	public CommonResult save(@RequestBody @Valid SaveData<ProcessItemRequestDto,ProcessItem> processItemSaveData) {
		processItemService.save(processItemSaveData);
		return responseService.getSuccessResult();
	}
}
