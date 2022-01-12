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
import com.nyd.erp.production.domain.production.ProductionReceive;
import com.nyd.erp.production.dto.production.receive.ProductionReceiveRequestDto;
import com.nyd.erp.production.dto.production.receive.ProductionReceiveResponseDto;
import com.nyd.erp.production.service.production.ProductionReceiveService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/productionReceive")
public class ProductionReceiveController {
	
	private final ProductionReceiveService productionReceiveService;
	private final ResponseService responseService;
	
	@GetMapping
	public ListResult<ProductionReceiveResponseDto> findAll() {
		return responseService.getListResult(productionReceiveService.findAll()); 
	}
	
	@PostMapping
	public CommonResult save(@RequestBody @Valid SaveData<ProductionReceiveRequestDto,ProductionReceive> productionReceiveSaveData) {
		productionReceiveService.save(productionReceiveSaveData);
		return responseService.getSuccessResult();
	}
}
