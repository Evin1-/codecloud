package com.mobileappscompany.training.codecloud.model.entities;

import com.orm.SugarRecord;

/**
 * Created by evin on 12/15/15.
 */
public class User_term extends SugarRecord{
    private User user;
    private Term term;
    private Long importance;

    public User_term() {
    }

    public User_term(User user, Term term, Long importance) {
        this.user = user;
        this.term = term;
        this.importance = importance;
    }

    @Override
    public String toString() {
        return "User_term{" +
                "user=" + user +
                ", term=" + term +
                ", importance=" + importance +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Term getTerm() {
        return term;
    }

    public void setTerm(Term term) {
        this.term = term;
    }

    public Long getImportance() {
        return importance;
    }

    public void setImportance(Long importance) {
        this.importance = importance;
    }

    public void improveImportance() {
        this.importance++;
    }
}
