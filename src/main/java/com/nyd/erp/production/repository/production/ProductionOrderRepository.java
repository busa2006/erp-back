package com.nyd.erp.production.repository.production;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nyd.erp.production.domain.production.ProductionOrder;

public interface ProductionOrderRepository extends JpaRepository<ProductionOrder,Long> {
}

