package com.fell.ssm.pojo;

import java.util.Date;

public class DtcrawlerProject {
    private Integer id;

    private String projectName;

    private String bizType;

    private String description;

    private String creator;

    private String modifier;

    private Date gmtCreate;

    private Date gmtModify;

    private String hbaseDataTable;

    private String hbaseCacheTable;

    private String cronExp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType == null ? null : bizType.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    public String getHbaseDataTable() {
        return hbaseDataTable;
    }

    public void setHbaseDataTable(String hbaseDataTable) {
        this.hbaseDataTable = hbaseDataTable == null ? null : hbaseDataTable.trim();
    }

    public String getHbaseCacheTable() {
        return hbaseCacheTable;
    }

    public void setHbaseCacheTable(String hbaseCacheTable) {
        this.hbaseCacheTable = hbaseCacheTable == null ? null : hbaseCacheTable.trim();
    }

    public String getCronExp() {
        return cronExp;
    }

    public void setCronExp(String cronExp) {
        this.cronExp = cronExp == null ? null : cronExp.trim();
    }
}