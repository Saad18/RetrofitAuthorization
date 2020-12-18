package com.saad.retrofitauthorization.resopnse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CvFile {

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("tsync_id")
    @Expose
    private String tsyncId;

    public CvFile() {
    }


    public CvFile(long id, String tsyncId) {
        super();
        this.id = id;
        this.tsyncId = tsyncId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTsyncId() {
        return tsyncId;
    }

    public void setTsyncId(String tsyncId) {
        this.tsyncId = tsyncId;
    }

}