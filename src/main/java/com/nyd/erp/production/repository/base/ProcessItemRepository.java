package com.nyd.erp.production.repository.base;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nyd.erp.production.domain.base.ProcessItem;

public interface ProcessItemRepository extends JpaRepository<ProcessItem,Long> {
}

