package com.pyq.cms.dao.model;

import java.io.Serializable;
import java.util.Date;

public class Circle implements Serializable {
    /**
     * 帖子id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * 微信openid
     *
     * @mbg.generated
     */
    private String userOpenid;

    /**
     * 内容
     *
     * @mbg.generated
     */
    private String content;

    /**
     * 图片
     *
     * @mbg.generated
     */
    private String images;

    /**
     * 发布时间
     *
     * @mbg.generated
     */
    private Date time;

    /**
     * 是否置顶，0无，1置顶
     *
     * @mbg.generated
     */
    private Byte istop;

    /**
     * 标签分类
     *
     * @mbg.generated
     */
    private String tag;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserOpenid() {
        return userOpenid;
    }

    public void setUserOpenid(String userOpenid) {
        this.userOpenid = userOpenid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Byte getIstop() {
        return istop;
    }

    public void setIstop(Byte istop) {
        this.istop = istop;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userOpenid=").append(userOpenid);
        sb.append(", content=").append(content);
        sb.append(", images=").append(images);
        sb.append(", time=").append(time);
        sb.append(", istop=").append(istop);
        sb.append(", tag=").append(tag);
        sb.append("]");
        return sb.toString();
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
        Circle other = (Circle) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserOpenid() == null ? other.getUserOpenid() == null : this.getUserOpenid().equals(other.getUserOpenid()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getImages() == null ? other.getImages() == null : this.getImages().equals(other.getImages()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getIstop() == null ? other.getIstop() == null : this.getIstop().equals(other.getIstop()))
            && (this.getTag() == null ? other.getTag() == null : this.getTag().equals(other.getTag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserOpenid() == null) ? 0 : getUserOpenid().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getImages() == null) ? 0 : getImages().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getIstop() == null) ? 0 : getIstop().hashCode());
        result = prime * result + ((getTag() == null) ? 0 : getTag().hashCode());
        return result;
    }
}