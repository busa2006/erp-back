package com.nyd.erp.production.repository.base;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nyd.erp.production.domain.base.Item;
import com.nyd.erp.production.domain.base.ItemProcess;

public interface ItemProcessRepository extends JpaRepository<ItemProcess,Long> {

	void findAllByItem(Item item);
}

