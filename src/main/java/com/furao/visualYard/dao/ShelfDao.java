package com.furao.visualYard.dao;

import com.furao.visualYard.entity.ShelfEntity;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public interface ShelfDao {

    List<ShelfEntity> queryShelfNoAll();

    /**
     * 根据名称获取信息
     * @param map
     * @return
     */
    List<Object> getShelfInfoByShelfNo(Map map);

    /**
     *
     * @param shelfEntityList
     * @return
     */
    boolean insertShelfByList(List<ShelfEntity> shelfEntityList);
}
