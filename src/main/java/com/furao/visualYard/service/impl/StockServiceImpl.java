package com.furao.visualYard.service.impl;

import com.furao.visualYard.dao.StockDao;
import com.furao.visualYard.entity.StockEntity;
import com.furao.visualYard.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImpl implements StockService {

    @Autowired
    StockDao stockDao;

    @Override
    public List<StockEntity> getAllStockList() {
        return stockDao.queryStockNoAll();
    }
}
