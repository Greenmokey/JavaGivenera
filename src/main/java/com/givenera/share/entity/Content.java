package com.givenera.share.entity;

import java.util.Date;

public class Content {
    private String appreciationId;

    private String addressid;

    private Date createdat;

    private Integer deletestatus;

    private Integer isshare;

    private Integer mergestatus;

    private String spamreporttext;

    private String spamreporttype;

    private String spamreporteruserid;

    private Integer spamstatus;

    private Integer status;

    private Date updatedat;

    private String subject;

    private String categorycontent;

    private String description;

    private String creatorid;

    private String creatoruserid;

    private Integer islook;

    private Double latitude;

    private Double longitude;

    public String getAppreciationId() {
        return appreciationId;
    }

    public void setAppreciationId(String appreciationId) {
        this.appreciationId = appreciationId == null ? null : appreciationId.trim();
    }

    public String getAddressid() {
        return addressid;
    }

    public void setAddressid(String addressid) {
        this.addressid = addressid == null ? null : addressid.trim();
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }

    public Integer getDeletestatus() {
        return deletestatus;
    }

    public void setDeletestatus(Integer deletestatus) {
        this.deletestatus = deletestatus;
    }

    public Integer getIsshare() {
        return isshare;
    }

    public void setIsshare(Integer isshare) {
        this.isshare = isshare;
    }

    public Integer getMergestatus() {
        return mergestatus;
    }

    public void setMergestatus(Integer mergestatus) {
        this.mergestatus = mergestatus;
    }

    public String getSpamreporttext() {
        return spamreporttext;
    }

    public void setSpamreporttext(String spamreporttext) {
        this.spamreporttext = spamreporttext == null ? null : spamreporttext.trim();
    }

    public String getSpamreporttype() {
        return spamreporttype;
    }

    public void setSpamreporttype(String spamreporttype) {
        this.spamreporttype = spamreporttype == null ? null : spamreporttype.trim();
    }

    public String getSpamreporteruserid() {
        return spamreporteruserid;
    }

    public void setSpamreporteruserid(String spamreporteruserid) {
        this.spamreporteruserid = spamreporteruserid == null ? null : spamreporteruserid.trim();
    }

    public Integer getSpamstatus() {
        return spamstatus;
    }

    public void setSpamstatus(Integer spamstatus) {
        this.spamstatus = spamstatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getUpdatedat() {
        return updatedat;
    }

    public void setUpdatedat(Date updatedat) {
        this.updatedat = updatedat;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getCategorycontent() {
        return categorycontent;
    }

    public void setCategorycontent(String categorycontent) {
        this.categorycontent = categorycontent == null ? null : categorycontent.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(String creatorid) {
        this.creatorid = creatorid == null ? null : creatorid.trim();
    }

    public String getCreatoruserid() {
        return creatoruserid;
    }

    public void setCreatoruserid(String creatoruserid) {
        this.creatoruserid = creatoruserid == null ? null : creatoruserid.trim();
    }

    public Integer getIslook() {
        return islook;
    }

    public void setIslook(Integer islook) {
        this.islook = islook;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}