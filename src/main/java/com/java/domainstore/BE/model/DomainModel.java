package com.java.domainstore.BE.model;

import com.java.domainstore.BE.dao.TopLevelDomainDAO;

import java.sql.Date;

public class DomainModel {
    private int id;
    private String domainName;
    private int tldId;
    private DomainStatusEnum status;
    private Date activeDate;
    private int years;
    private Integer ownerId;
    private Date createdAt; 
    
    public enum DomainStatusEnum {
        AVAILABLE, SOLD;
    }
    
    public DomainModel() {
    }

    public DomainModel(int id, String domainName, int tldId, DomainStatusEnum status, Date activeDate, int years, Integer ownerId, Date createdAt) {
        this.id = id;
        this.domainName = domainName;
        this.tldId = tldId;
        this.status = status;
        this.activeDate = activeDate;
        this.years = years;
        this.ownerId = ownerId;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public int getTldId() {
        return tldId;
    }

    public void setTldId(int tldId) {
        this.tldId = tldId;
    }

    public DomainStatusEnum getStatus() {
        return status;
    }

    public void setStatus(DomainStatusEnum status) {
        this.status = status;
    }

    public Date getActiveDate() {
        return activeDate;
    }

    public void setActiveDate(Date activeDate) {
        this.activeDate = activeDate;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "DomainModel{" +
                "id=" + id +
                ", domainName='" + domainName + '\'' +
                ", tldId=" + tldId +
                ", status=" + status +
                ", activeDate=" + activeDate +
                ", years=" + years +
                ", ownerId=" + ownerId +
                ", createdAt=" + createdAt +
                '}';
    }
    public TopLevelDomainModel getTopLevelDomainbyId(int id){
        for(TopLevelDomainModel tld : TopLevelDomainDAO.getInstance().selectAll()){
            if(tld.getId() == id) return tld;
        }
        return new TopLevelDomainModel();
    }
}
