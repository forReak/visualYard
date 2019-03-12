package com.furao.visualYard.service.impl;

import com.furao.visualYard.dao.ShelfDao;
import com.furao.visualYard.service.UtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static com.furao.visualYard.constants.FinalConstants.t_shelf;

@Service
public class UtilServiceImpl implements UtilService {

    @Autowired
    ShelfDao shelfDao;



    @Override
    public List<Object> checkNoDuplication(List<String> checkedList,Integer paremes, String tableName) {
        switch (tableName){
            case t_shelf:
                Map<String,Object> map = new HashMap<>();
                map.put("shelfNo",checkedList);
                map.put("stockId",paremes);
                return shelfDao.getShelfInfoByShelfNo(map);


            default:return null;
        }
    }
}
