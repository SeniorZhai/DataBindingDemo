package io.github.seniorzhai.databindingdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import io.github.seniorzhai.databindingdemo.model.PlainUser;
import io.github.seniorzhai.databindingdemo.model.RecyclerAdapter;


/**
 * Created by zhaitao on 15/8/14.
 */
public class RecyclerActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<PlainUser> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            PlainUser user = new PlainUser();
            user.age.set(10);
            user.name.set("No." + i);
            list.add(user);
        }
        recyclerView.setAdapter(new RecyclerAdapter(list));
    }

    public static void start(Context context) {
        Intent intent = new Intent(context, RecyclerActivity.class);
        context.startActivity(intent);
    }

}
