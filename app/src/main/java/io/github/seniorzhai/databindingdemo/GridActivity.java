package io.github.seniorzhai.databindingdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

import io.github.seniorzhai.databindingdemo.model.PlainUser;


/**
 * Created by zhaitao on 15/8/14.
 */
public class GridActivity extends AppCompatActivity {

    private GridView mGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        mGridView = (GridView) findViewById(R.id.gridView);
        List<PlainUser> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            PlainUser user = new PlainUser();
            user.age.set(10);
            user.name.set("No." + i);
            list.add(user);
        }
        mGridView.setAdapter(new MyAdapter(list, getLayoutInflater()));
    }

    public static void start(Context context) {
        Intent intent = new Intent(context, GridActivity.class);
        context.startActivity(intent);
    }
}
