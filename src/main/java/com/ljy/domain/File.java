package com.ljy.domain;

/**
 * @author lijingyu
 * @date 2019/9/23 12:27
 */
public class File {
    private Integer id;
    private String filename;
    private String creator;
    private String type;
    private String store;
    private String remark;
    private String birth;

    @Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", filename='" + filename + '\'' +
                ", creator='" + creator + '\'' +
                ", type='" + type + '\'' +
                ", store='" + store + '\'' +
                ", remark='" + remark + '\'' +
                ", birth='" + birth + '\'' +
                '}';
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
