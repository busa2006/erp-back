package com.nyd.erp.production.controller.production;

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
import com.nyd.erp.production.domain.production.ProductionResult;
import com.nyd.erp.production.dto.production.result.ProductionResultRequestDto;
import com.nyd.erp.production.dto.production.result.ProductionResultResponseDto;
import com.nyd.erp.production.service.production.ProductionResultService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/productionResult")
public class ProductionResultController {
	
	private final ProductionResultService productionResultService;
	private final ResponseService responseService;
	
	@GetMapping
	public ListResult<ProductionResultResponseDto> findAll() {
		return responseService.getListResult(productionResultService.findAll()); 
	}
	
	@PostMapping
	public CommonResult save(@RequestBody @Valid SaveData<ProductionResultRequestDto,ProductionResult> productionResultSaveData) {
		productionResultService.save(productionResultSaveData);
		return responseService.getSuccessResult();
	}
}
