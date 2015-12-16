package com.mobileappscompany.training.codecloud.model.scripts;

import com.mobileappscompany.training.codecloud.model.entities.Pack;
import com.mobileappscompany.training.codecloud.model.entities.Technology;
import com.mobileappscompany.training.codecloud.model.entities.Term;
import com.mobileappscompany.training.codecloud.model.entities.Term_pack;
import com.mobileappscompany.training.codecloud.model.entities.Term_parent;
import com.mobileappscompany.training.codecloud.model.entities.User;
import com.mobileappscompany.training.codecloud.model.entities.User_technology;
import com.mobileappscompany.training.codecloud.model.entities.User_term;

/**
 * Created by evin on 12/15/15.
 */
public class Startup {

    public static void deleteAll(){
        Term_pack.deleteAll(Term_pack.class);
        Term_parent.deleteAll(Term_parent.class);
        User_term.deleteAll(User_term.class);
        User_technology.deleteAll(User_technology.class);
        Pack.deleteAll(Pack.class);
        Technology.deleteAll(Technology.class);
        Term.deleteAll(Term.class);
        User.deleteAll(User.class);
    }

    public static void start(){
        User user = new User("Default");
        user.save();

        Technology technology = new Technology("Android");
        technology.save();

        User_technology user_technology = new User_technology(user, technology);
        user_technology.save();

        Term term1 = new Term("RecyclerView", technology, "No docs for now");
        term1.save();
        Term term2 = new Term("LinearLayout", technology, "No docs for now");
        term2.save();
        Term term3 = new Term("RelativeLayout", technology, "No docs for now");
        term3.save();
        Term term4 = new Term("ViewGroup", technology, "No docs for now");
        term4.save();

        User_term user_term1 = new User_term(user, term2, 2l);
        user_term1.save();
        User_term user_term2 = new User_term(user, term1, 3l);
        user_term2.save();

        Pack pack = new Pack("java.util");
        pack.save();
        Pack pack1 = new Pack("android.widget");
        pack1.save();
        Pack pack2 = new Pack("android.view");
        pack2.save();

        Term_pack term_pack = new Term_pack(term4, pack2);
        term_pack.save();

        Term_parent term_parent = new Term_parent(term2, term4);
        term_parent.save();
        Term_parent term_parent1 = new Term_parent(term2, term4);
        term_parent1.save();

    }
}
