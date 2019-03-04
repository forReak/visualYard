package com.furao.visualYard.dao;

import com.furao.visualYard.entity.ShelfEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShelfDao {

    List<ShelfEntity> queryShelfNoAll();
}
