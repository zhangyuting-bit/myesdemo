package com.zb.pojo;

import java.io.Serializable;

public class Course implements Serializable {
    private String name;
    private String studymodel;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudymodel() {
        return studymodel;
    }

    public void setStudymodel(String studymodel) {
        this.studymodel = studymodel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Course() {
    }

    public Course(String name, String studymodel, String description) {
        this.name = name;
        this.studymodel = studymodel;
        this.description = description;
    }
}
