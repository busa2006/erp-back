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
import com.nyd.erp.production.domain.base.Item;
import com.nyd.erp.production.dto.base.item.ItemRequestDto;
import com.nyd.erp.production.dto.base.item.ItemResponseDto;
import com.nyd.erp.production.service.base.ItemService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/item")
public class ItemController {
	
	private final ItemService itemService;
	private final ResponseService responseService;
	
	@GetMapping
	public ListResult<ItemResponseDto> findAll() {
		return responseService.getListResult(itemService.findAll()); 
	}
	
	@PostMapping
	public CommonResult save(@RequestBody @Valid  SaveData<ItemRequestDto,Item> itemSaveData) {
		itemService.save(itemSaveData);
		return responseService.getSuccessResult();
	}
}
