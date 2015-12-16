package com.mobileappscompany.training.codecloud.presenter;

import android.util.Log;
import android.widget.ListView;

import com.mobileappscompany.training.codecloud.model.entities.Technology;
import com.mobileappscompany.training.codecloud.model.entities.Term;
import com.mobileappscompany.training.codecloud.model.entities.User;
import com.mobileappscompany.training.codecloud.model.entities.User_term;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by evin on 12/15/15.
 */
public class Presenter {
    User user;
    Technology technology;

    public Presenter() {
        List<Technology> techs = Technology.find(Technology.class, "");
//        technology = Technology.findById(Technology.class, 1);
        technology = techs.get(0);
        List<User> users = User.find(User.class, "");
        user = users.get(0);
        Log.d("PrintUser", user.toString());
        Log.d("PrintUser", users.toString());
    }

    public boolean add_word(String s, ListView listView1) {
//        Log.d("PrintUser", user.toString());
        try{
            List<Term> terms = Term.find(Term.class, "words = ?", s);
            if (terms.size() < 1){
                Term new_term = new Term(s, technology, "No docs for now");
                new_term.save();
                User_term user_term = new User_term(user, new_term, 0l);
//                Log.d("PrintUser2", user.toString());
//                Log.d("PrintUser3", (new User_term(user, new_term, 0l)).toString());
//                Log.d("PrintUser2before", user_term.toString());
                user_term.save();
//                Log.d("PrintUser2after", user_term.toString());
            }else{
                Term old_term = terms.get(0);
                List<User_term> user_terms = User_term.find(User_term.class, "term = ?", old_term.getId().toString());
                User_term user_term = user_terms.get(0);
//                Log.d("PrintUser2", user.toString());
//                Log.d("PrintUser3", (new User_term(user, old_term, 0l)).toString());
//                Log.d("PrintUser2", user_term.toString());
                user_term.improveImportance();
                user_term.save();
            }
            get_words();
        }catch (Exception e){
            Log.e("add_word", e.toString());
        }

        return false;
    }

    public String[] get_words(){
        List<User_term> user_terms = User_term.find(User_term.class, "user = ? order by importance desc", user.getId().toString());
//        Log.d("User terms", user_terms.toString());
        String[] array = new String[user_terms.size()];

        int i = 0;

        for (User_term user_term : user_terms){
            array[i++] = user_term.getTerm().getWords() + "\t" + user_term.getImportance();
            Log.d("Importance", array[i - 1]);
        }

        return array;
    }
}
