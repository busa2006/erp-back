package com.nyd.erp.production.repository.base;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nyd.erp.production.domain.base.Item;
import com.nyd.erp.production.domain.base.Warehouse;

public interface WarehouseRepository extends JpaRepository<Warehouse,Long> {
}

