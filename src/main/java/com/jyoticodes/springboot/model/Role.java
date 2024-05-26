package com.jyoticodes.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Role {
    public String getRoleNane() {
        return roleNane;
    }
    public String getRoleDescription() {
        return roleDescription;
    }
    @Id
    private String roleNane;
    @Override
    public String toString() {
        return "Role [roleNane=" + roleNane + ", roleDescription=" + roleDescription + ", toString()="
                + super.toString() + "]";
    }
    private String roleDescription;
    public void setRoleNane(String roleNane) {
        this.roleNane = roleNane;
    }
    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }
    
}
