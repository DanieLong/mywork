package com.lk.manage.mywork.model;

import java.util.Date;
import java.util.List;

/**
 * @@author daniel
 * 账号对应角色
 */
public class LocalAuthRole {
    private String id;
    private String localAuthId;
    //一个账号对应多个角色
    private List<Role> roles;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocalAuthId() {
        return localAuthId;
    }

    public void setLocalAuthId(String localAuthId) {
        this.localAuthId = localAuthId;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

}
