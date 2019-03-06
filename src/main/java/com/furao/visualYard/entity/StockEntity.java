package com.furao.visualYard.entity;

public class StockEntity {

    private Integer id;
    private Integer stockCapacityNum;
    private Integer goKey;

    private String uuid;
    private String timeUuid;
    private String stockNo;
    private String stockDesc;
    private String stockType;
    private String goPos;
    private String goCategory;
    private String goSize;
    private String goJson;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTimeUuid() {
        return timeUuid;
    }

    public void setTimeUuid(String timeUuid) {
        this.timeUuid = timeUuid;
    }

    public String getStockNo() {
        return stockNo;
    }

    public void setStockNo(String stockNo) {
        this.stockNo = stockNo;
    }

    public String getStockDesc() {
        return stockDesc;
    }

    public void setStockDesc(String stockDesc) {
        this.stockDesc = stockDesc;
    }

    public Integer getStockCapacityNum() {
        return stockCapacityNum;
    }

    public void setStockCapacityNum(Integer stockCapacityNum) {
        this.stockCapacityNum = stockCapacityNum;
    }

    public String getStockType() {
        return stockType;
    }

    public void setStockType(String stockType) {
        this.stockType = stockType;
    }

    public String getGoPos() {
        return goPos;
    }

    public void setGoPos(String goPos) {
        this.goPos = goPos;
    }

    public String getGoCategory() {
        return goCategory;
    }

    public void setGoCategory(String goCategory) {
        this.goCategory = goCategory;
    }

    public Integer getGoKey() {
        return goKey;
    }

    public void setGoKey(Integer goKey) {
        this.goKey = goKey;
    }

    public String getGoSize() {
        return goSize;
    }

    public void setGoSize(String goSize) {
        this.goSize = goSize;
    }

    public String getGoJson() {
        return goJson;
    }

    public void setGoJson(String goJson) {
        this.goJson = goJson;
    }
}
