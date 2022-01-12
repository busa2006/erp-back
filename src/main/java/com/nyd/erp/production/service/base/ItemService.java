package com.nyd.erp.production.service.base;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.nyd.erp.common.model.save.SaveData;
import com.nyd.erp.production.domain.base.Item;
import com.nyd.erp.production.dto.base.item.ItemRequestDto;
import com.nyd.erp.production.dto.base.item.ItemResponseDto;
import com.nyd.erp.production.repository.base.ItemRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemService {
	private final ItemRepository itemRepository;
	
	public List<ItemResponseDto> findAll() {
		List<Item> itemList = itemRepository.findAll();
		return itemList.stream().map(p -> new ItemResponseDto(p)).collect(Collectors.toList());
	}	
	
	public void save(SaveData<ItemRequestDto,Item> itemSaveData) {
		itemSaveData.toEntityAndSave(itemRepository);
	}
}

