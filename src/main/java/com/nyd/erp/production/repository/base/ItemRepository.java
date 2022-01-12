package com.nyd.erp.production.repository.base;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nyd.erp.production.domain.base.Item;

@Scope(value = "prototype")
@Repository
public interface ItemRepository extends JpaRepository<Item,Long> {
}

