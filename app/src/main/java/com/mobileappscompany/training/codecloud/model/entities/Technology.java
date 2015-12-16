package com.mobileappscompany.training.codecloud.model.entities;

import com.orm.SugarRecord;

/**
 * Created by evin on 12/15/15.
 */
public class Technology extends SugarRecord{
    private String name;

    public Technology() {
    }

    public Technology(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Technology{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
