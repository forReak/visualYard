package com.furao.visualYard.dao;

import com.furao.visualYard.entity.StockEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockDao {

    List<StockEntity> queryStockNoAll();
}
