package com.furao.visualYard.service.impl;

import com.furao.visualYard.Exceptions.InParamesException;
import com.furao.visualYard.dao.ShelfDao;
import com.furao.visualYard.entity.ShelfEntity;
import com.furao.visualYard.service.ShelfService;
import com.furao.visualYard.service.UtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


import static com.furao.visualYard.constants.FinalConstants.t_shelf;
import static com.furao.visualYard.tools.tools.split;
import static com.furao.visualYard.tools.tools.checkEmpty;
import static com.furao.visualYard.tools.tools.generateUuid;

@Service
public class ShelfServiceImpl implements ShelfService {

    @Autowired
    ShelfDao shelfDao;
    @Autowired
    UtilService utilService;

    @Override
    public List<ShelfEntity> getAllShelfList() {
        return shelfDao.queryShelfNoAll();
    }

    @Override
    public boolean addShelfs(ShelfEntity shelfEntity) {
        String shelfNo = shelfEntity.getShelfNo();
        if(checkEmpty(shelfNo)){
            throw new InParamesException("不能将空的货架名进行插入");
        }
        List<String> shelfNoList = split(shelfEntity.getShelfNo(),",");
        assert shelfNoList != null;
        for (String s : shelfNoList) {
            if(checkEmpty(s)){
                throw new InParamesException("不能将空的货架名进行插入");
            }
        }
        List<Object> dupList = utilService.checkNoDuplication(shelfNoList,shelfEntity.getStockId(),t_shelf);
        if(dupList.size()>0){
            throw new RuntimeException("无法新增,货架名重复");
        }
        List<ShelfEntity> shelfEntityList = new ArrayList<>();
        for (int i = 0; i < shelfNoList.size(); i++) {
            String insertNo = shelfNoList.get(i);
            ShelfEntity insertShelf = new ShelfEntity();
            insertShelf.setUuid(generateUuid());
            insertShelf.setTimeUuid(generateUuid());
            insertShelf.setShelfNo(insertNo);
            insertShelf.setGoCategory("shelf");
            if(!checkEmpty(shelfEntity.getGoPos())){
                insertShelf.setGoPos(shelfEntity.getGoPos());
            }else{
                insertShelf.setGoPos(getPos(i));
            }
            insertShelf.setGoSize(shelfEntity.getGoSize());
            insertShelf.setShelfDesc(shelfEntity.getShelfDesc());
            insertShelf.setShelfStatus(shelfEntity.getShelfStatus());
            insertShelf.setShelfQty(shelfEntity.getShelfQty());
            insertShelf.setStockId(shelfEntity.getStockId());
            shelfEntityList.add(insertShelf);
        }
        shelfDao.insertShelfByList(shelfEntityList);
        return true;
    }


    /**
     * 方法内部调用
     * node位置信息 形成网格状的10*n的位置
     * 后期通过配置项进行调换x，y位置可实现初始化时横向还是竖向排列
     * @Author fu
     * @Date 2018/1/17
     * @param j 当前是第几个
     * @return
     * @Throws
     */
    private String getPos(int j){
        int x = (j/10)*60;
        int y = (j%10)*60;
        return y +" "+ x;
    }
}
