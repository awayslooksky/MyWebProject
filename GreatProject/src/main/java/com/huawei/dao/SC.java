package com.huawei.dao;

public class SC {
    private String sid;
    private String cid;
    private int score;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "SC{" +
                "sid='" + sid + '\'' +
                ", cid='" + cid + '\'' +
                ", score=" + score +
                '}';
    }
}
