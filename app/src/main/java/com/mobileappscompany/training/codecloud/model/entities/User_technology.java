package com.mobileappscompany.training.codecloud.model.entities;

import com.orm.SugarRecord;

/**
 * Created by evin on 12/15/15.
 */
public class User_technology extends SugarRecord {
    private User user;
    private Technology technology;

    public User_technology() {
    }

    public User_technology(User user, Technology technology) {
        this.user = user;
        this.technology = technology;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Technology getTechnology() {
        return technology;
    }

    public void setTechnology(Technology technology) {
        this.technology = technology;
    }
}
