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
import com.nyd.erp.production.domain.base.Warehouse;
import com.nyd.erp.production.dto.base.warehouse.WarehouseRequestDto;
import com.nyd.erp.production.dto.base.warehouse.WarehouseResponseDto;
import com.nyd.erp.production.service.base.WarehouseService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/warehouse")
public class WarehouseController {
	
	private final WarehouseService warehouseService;
	private final ResponseService responseService;
	
	@GetMapping
	public ListResult<WarehouseResponseDto> findAll() {
		return responseService.getListResult(warehouseService.findAll()); 
	}
	
	@PostMapping
	public CommonResult save(@RequestBody @Valid SaveData<WarehouseRequestDto,Warehouse> warehouseSaveData) {
		warehouseService.save(warehouseSaveData);
		return responseService.getSuccessResult();
	}
}
