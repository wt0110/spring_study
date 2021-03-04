package com.example.live.study.domain;

public class RankItem {
    private String momoid;
    private String name;
    private String photo;
    private String gotoStr;
    private String roomid;
    private Boolean isFollow;
    private Boolean ifLive;
    private long rank;
    private long score;
    private String rewardText;


    public String getMomoid() {
        return this.momoid;
    }

    public void setMomoid(String momoid) {
        this.momoid = momoid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return this.photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getGotoStr() {
        return this.gotoStr;
    }

    public void setGotoStr(String gotoStr) {
        this.gotoStr = gotoStr;
    }

    public String getRoomid() {
        return this.roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public Boolean isIsFollow() {
        return this.isFollow;
    }

    public Boolean getIsFollow() {
        return this.isFollow;
    }

    public void setIsFollow(Boolean isFollow) {
        this.isFollow = isFollow;
    }

    public Boolean isIfLive() {
        return this.ifLive;
    }

    public Boolean getIfLive() {
        return this.ifLive;
    }

    public void setIfLive(Boolean ifLive) {
        this.ifLive = ifLive;
    }

    public long getRank() {
        return this.rank;
    }

    public void setRank(long rank) {
        this.rank = rank;
    }

    public long getScore() {
        return this.score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public String getRewardText() {
        return this.rewardText;
    }

    public void setRewardText(String rewardText) {
        this.rewardText = rewardText;
    }

}
