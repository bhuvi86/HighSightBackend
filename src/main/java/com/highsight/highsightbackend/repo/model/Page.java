package com.highsight.highsightbackend.repo.model;

public class Page {
    int id;
    String url;
    String overallScore;

    public Page(int id, String url, String overallScore) {
        this.id = id;
        this.url = url;
        this.overallScore = overallScore;
    }

    public int getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getOverallScore() {
        return overallScore;
    }
}

