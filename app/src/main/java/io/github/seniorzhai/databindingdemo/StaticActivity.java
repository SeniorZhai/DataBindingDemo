package io.github.seniorzhai.databindingdemo;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.github.seniorzhai.databindingdemo.databinding.ActivityStaticBinding;
import io.github.seniorzhai.databindingdemo.model.StaticUser;


/**
 * Created by zhaitao on 15/8/14.
 */
public class StaticActivity extends AppCompatActivity {
    StaticUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityStaticBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_static);
        user = new StaticUser("SeniorZhai", 24);
        binding.setUser(user);
    }

    public static void start(Context context) {
        Intent intent = new Intent(context, StaticActivity.class);
        context.startActivity(intent);
    }

}
