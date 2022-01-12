package com.nyd.erp.production.repository.base;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nyd.erp.production.domain.base.Process;

public interface ProcessRepository extends JpaRepository<Process,Long> {
}

