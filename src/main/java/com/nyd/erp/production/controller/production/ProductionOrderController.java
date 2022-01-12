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
import com.nyd.erp.production.domain.production.ProductionOrder;
import com.nyd.erp.production.dto.production.order.ProductionOrderRequestDto;
import com.nyd.erp.production.dto.production.order.ProductionOrderResponseDto;
import com.nyd.erp.production.service.production.ProductionOrderService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/productionOrder")
public class ProductionOrderController {
	
	private final ProductionOrderService productionOrderService;
	private final ResponseService responseService;
	
	@GetMapping
	public ListResult<ProductionOrderResponseDto> findAll() {
		return responseService.getListResult(productionOrderService.findAll()); 
	}
	
	@PostMapping
	public CommonResult save(@RequestBody @Valid SaveData<ProductionOrderRequestDto,ProductionOrder> productionOrderSaveData) {
		productionOrderService.save(productionOrderSaveData);
		return responseService.getSuccessResult();
	}
}
