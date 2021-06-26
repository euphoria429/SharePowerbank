package com.hcx.bean;

public class Powerbank {
    private Integer pobkId;

    private Integer pobkCupboardId;

    private String pobkStatus;

    public Powerbank() {
    }

    public Powerbank(Integer pobkCupboardId, String pobkStatus) {
        this.pobkCupboardId = pobkCupboardId;
        this.pobkStatus = pobkStatus;
    }

    public Integer getPobkId() {
        return pobkId;
    }

    public void setPobkId(Integer pobkId) {
        this.pobkId = pobkId;
    }

    public Integer getPobkCupboardId() {
        return pobkCupboardId;
    }

    public void setPobkCupboardId(Integer pobkCupboardId) {
        this.pobkCupboardId = pobkCupboardId;
    }

    public String getPobkStatus() {
        return pobkStatus;
    }

    public void setPobkStatus(String pobkStatus) {
        this.pobkStatus = pobkStatus == null ? null : pobkStatus.trim();
    }
}