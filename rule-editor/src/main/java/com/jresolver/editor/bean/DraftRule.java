package com.jresolver.editor.bean;

import java.util.List;

public class DraftRule {

    private String name;
    private String file;
    private List<String> conditions;
    private List<String> recommendations;
    private List<String> attributes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFile() {
      return file;
    }

    public void setFile(String file) {
      this.file = file;
    }

    public List<String> getConditions() {
        return conditions;
    }

    public void setConditions(List<String> conditions) {
        this.conditions = conditions;
    }

    public List<String> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(List<String> recommendations) {
        this.recommendations = recommendations;
    }

    public List<String> getAttributes() {
    return attributes;
  }

    public void setAttributes(List<String> attributes) {
    this.attributes = attributes;
  }
}
