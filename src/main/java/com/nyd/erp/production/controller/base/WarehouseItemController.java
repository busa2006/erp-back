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
import com.nyd.erp.production.domain.base.WarehouseItem;
import com.nyd.erp.production.dto.base.warehouseItem.WarehouseItemRequestDto;
import com.nyd.erp.production.dto.base.warehouseItem.WarehouseItemResponseDto;
import com.nyd.erp.production.service.base.WarehouseItemService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/warehouseItem")
public class WarehouseItemController {
	
	private final WarehouseItemService warehouseItemService;
	private final ResponseService responseService;
	
	@GetMapping
	public ListResult<WarehouseItemResponseDto> findAll() {
		return responseService.getListResult(warehouseItemService.findAll()); 
	}
	
	@PostMapping
	public CommonResult save(@RequestBody @Valid SaveData<WarehouseItemRequestDto,WarehouseItem> warehouseItemSaveData) {
		warehouseItemService.save(warehouseItemSaveData);
		return responseService.getSuccessResult();
	}
}
