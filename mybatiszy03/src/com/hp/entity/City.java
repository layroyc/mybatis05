package com.hp.entity;

import java.io.Serializable;
import java.util.List;

/**
 * city
 * @author 
 */
public class City implements Serializable {
    private Integer cid;

    private String cname;

    /**
     * 城市备注
     */
    private String csk;

    private Integer personcount;
    private List<Cantonal> cantonalList;

    public List<Cantonal> getCantonalList() {
        return cantonalList;
    }

    public void setCantonalList(List<Cantonal> cantonalList) {
        this.cantonalList = cantonalList;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private static final long serialVersionUID = 1L;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCsk() {
        return csk;
    }

    public void setCsk(String csk) {
        this.csk = csk;
    }

    public Integer getPersoncount() {
        return personcount;
    }

    public void setPersoncount(Integer personcount) {
        this.personcount = personcount;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        City other = (City) that;
        return (this.getCid() == null ? other.getCid() == null : this.getCid().equals(other.getCid()))
            && (this.getCname() == null ? other.getCname() == null : this.getCname().equals(other.getCname()))
            && (this.getCsk() == null ? other.getCsk() == null : this.getCsk().equals(other.getCsk()))
            && (this.getPersoncount() == null ? other.getPersoncount() == null : this.getPersoncount().equals(other.getPersoncount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCid() == null) ? 0 : getCid().hashCode());
        result = prime * result + ((getCname() == null) ? 0 : getCname().hashCode());
        result = prime * result + ((getCsk() == null) ? 0 : getCsk().hashCode());
        result = prime * result + ((getPersoncount() == null) ? 0 : getPersoncount().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "City{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", csk='" + csk + '\'' +
                ", personcount=" + personcount +
                ", cantonalList=" + cantonalList +
                '}';
    }
}