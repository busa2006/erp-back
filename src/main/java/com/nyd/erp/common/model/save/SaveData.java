package com.nyd.erp.common.model.save;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.nyd.erp.production.repository.base.ItemRepository;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class SaveData<T extends Dto<E>,E>{
	
	@Valid
	private List<T> created;
	@Valid
	private List<T> updated;
	@Valid
	private List<T> deleted;
	
	private List<E> create = new ArrayList<E>();
	private List<E> update = new ArrayList<E>();
	private List<E> delete = new ArrayList<E>();
	
	public void toEntity() {
		for(T createData : created) {
			create.add(createData.toEntity());
		}
		
		for(T updateData : updated) {
			update.add(updateData.toEntity());		
		}
		
		for(T deletedData : deleted) {
			delete.add(deletedData.toEntity());
		}	
	}
	
	public void save(JpaRepository<E,Long> repository) {
		if(create.size() > 0) repository.saveAll(create);
		if(update.size() > 0) repository.saveAll(update);
		if(delete.size() > 0) repository.deleteAll(delete);
	}
	
	public void toEntityAndSave(JpaRepository<E,Long> repository) {
		toEntity();
		save(repository);
	}
}
