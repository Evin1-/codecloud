package com.mobileappscompany.training.codecloud.activities;

import android.database.sqlite.SQLiteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.mobileappscompany.training.codecloud.R;
import com.mobileappscompany.training.codecloud.model.entities.Pack;
import com.mobileappscompany.training.codecloud.model.entities.Technology;
import com.mobileappscompany.training.codecloud.model.entities.Term;
import com.mobileappscompany.training.codecloud.model.scripts.PrintHelper;
import com.mobileappscompany.training.codecloud.model.scripts.Startup;
import com.mobileappscompany.training.codecloud.presenter.Presenter;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    Button button1;
    ListView listView1;

    Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.edit1);
        button1 = (Button) findViewById(R.id.btn1);
        listView1 = (ListView) findViewById(R.id.list1);


        // Debugging!!!! Remember to remove.
        try{
            Startup.deleteAll();
        }catch (SQLiteException e){
            Log.e("deleteAll", e.toString());
        }
        Startup.start();

        PrintHelper.printTerm();
        PrintHelper.printPack();
        presenter = new Presenter();

    }

    public void update_list(View view) {

    }

    public void add_word(View view) {
        presenter.add_word(editText1.getText().toString(), listView1);
        PrintHelper.printUserTerm();
        PrintHelper.printUser();
        String[] ar = presenter.get_words();

        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.list_content,ar);
        ListView listView = (ListView) findViewById(R.id.list1);
        listView.setAdapter(adapter);
    }
}
