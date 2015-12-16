package com.mobileappscompany.training.codecloud.model.entities;

import com.orm.SugarRecord;

/**
 * Created by evin on 12/15/15.
 */
public class Term_parent extends SugarRecord{
    private Term term;
    private Term parent;

    public Term_parent() {
    }

    public Term_parent(Term term, Term parent) {
        this.term = term;
        this.parent = parent;
    }

    public Term getTerm() {
        return term;
    }

    public void setTerm(Term term) {
        this.term = term;
    }

    public Term getParent() {
        return parent;
    }

    public void setParent(Term parent) {
        this.parent = parent;
    }
}
