package com.nyd.erp.production.repository.base;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nyd.erp.production.domain.base.ItemProcess;
import com.nyd.erp.production.domain.base.WarehouseItem;

public interface WarehouseItemRepository extends JpaRepository<WarehouseItem,Long> {
}

