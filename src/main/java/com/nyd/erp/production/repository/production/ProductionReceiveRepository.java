package com.nyd.erp.production.repository.production;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nyd.erp.production.domain.production.ProductionOrder;
import com.nyd.erp.production.domain.production.ProductionReceive;
import com.nyd.erp.production.domain.production.ProductionResult;

public interface ProductionReceiveRepository extends JpaRepository<ProductionReceive,Long> {
}

