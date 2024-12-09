package com.tekup.firstproject.Entities;

public enum CoursType {
    COURS_LIVE("Cours_live"),
    COURS_ENREGISTRES("Cours_enregistres");

    private final String type;
    CoursType(String type){
        this.type=type;
    }


    public String getType() {
        return type;
    }
}
