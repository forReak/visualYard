package com.furao.visualYard.service;

import java.util.List;

public interface UtilService {

    /**
     * 验证传入的checkedList是否在数据库中存在，如果存在返回存在的数据项
     * @param checkedList
     * @param tableName
     * @return
     */
    List<Object> checkNoDuplication(List<String> checkedList,Integer paremes,String tableName);
}
