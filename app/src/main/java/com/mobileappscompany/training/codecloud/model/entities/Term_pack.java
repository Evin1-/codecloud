package com.mobileappscompany.training.codecloud.model.entities;

import com.orm.SugarRecord;

/**
 * Created by evin on 12/15/15.
 */
public class Term_pack  extends SugarRecord{
    private Term term;
    private Pack pack;

    public Term_pack() {
    }

    public Term_pack(Term term, Pack pack) {
        this.term = term;
        this.pack = pack;
    }

    public Term getTerm() {
        return term;
    }

    public void setTerm(Term term) {
        this.term = term;
    }

    public Pack getPack() {
        return pack;
    }

    public void setPack(Pack pack) {
        this.pack = pack;
    }
}
