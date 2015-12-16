package com.mobileappscompany.training.codecloud.model.scripts;

import android.util.Log;

import com.mobileappscompany.training.codecloud.model.entities.Pack;
import com.mobileappscompany.training.codecloud.model.entities.Term;
import com.mobileappscompany.training.codecloud.model.entities.User;
import com.mobileappscompany.training.codecloud.model.entities.User_term;

/**
 * Created by evin on 12/15/15.
 */
public class PrintHelper {
    public static void printPack(){
        for (Pack pack : Pack.listAll(Pack.class)){
            Log.d("Pack", pack.toString());
        }
    }

    public static void printTerm(){
        for (Term term : Term.listAll(Term.class)){
            Log.d("Term", term.toString());
        }
    }

    public static void printUserTerm(){
        for (User_term user_term : User_term.listAll(User_term.class)){
            Log.d("UserTerm", user_term.toString());
        }
    }

    public static void printUser(){
        for (User user : User.listAll(User.class)){
            Log.d("User", user.toString());
        }
    }

}
