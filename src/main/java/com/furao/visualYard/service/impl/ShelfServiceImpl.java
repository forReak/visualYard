package com.furao.visualYard.service.impl;

import com.furao.visualYard.dao.ShelfDao;
import com.furao.visualYard.entity.ShelfEntity;
import com.furao.visualYard.service.ShelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShelfServiceImpl implements ShelfService {

    @Autowired
    ShelfDao shelfDao;

    @Override
    public List<ShelfEntity> getAllShelfList() {
        return shelfDao.queryShelfNoAll();
    }
}
