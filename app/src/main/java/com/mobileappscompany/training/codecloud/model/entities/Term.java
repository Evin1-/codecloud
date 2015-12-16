package com.mobileappscompany.training.codecloud.model.entities;

import com.orm.SugarRecord;

/**
 * Created by evin on 12/15/15.
 */
public class Term extends SugarRecord {
    private String words;
    private Technology technology;
    private String docs;

    public Term() {
    }

    public Term(String words, Technology technology, String docs) {
        this.words = words;
        this.technology = technology;
        this.docs = docs;
    }

    @Override
    public String toString() {
        return "Term{" +
                "words='" + words + '\'' +
                ", technology=" + technology +
                ", docs='" + docs + '\'' +
                '}';
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public Technology getTechnology() {
        return technology;
    }

    public void setTechnology(Technology technology) {
        this.technology = technology;
    }

    public String getDocs() {
        return docs;
    }

    public void setDocs(String docs) {
        this.docs = docs;
    }
}
