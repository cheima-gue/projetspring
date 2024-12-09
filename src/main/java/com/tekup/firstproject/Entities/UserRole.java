package com.tekup.firstproject.Entities;

public enum UserRole {
    NUTRITIONNISTE("Nutritionniste"),
    COACH("Coach"),
    CLIENT("Client"),
    ADMIN("Admin");
    private final String role;
    UserRole(String role){
        this.role=role;
    }


    public String getRole() {
        return role;
    }
}
