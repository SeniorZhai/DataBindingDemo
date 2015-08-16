package io.github.seniorzhai.databindingdemo;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayMap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import io.github.seniorzhai.databindingdemo.databinding.ActivityObservaleBinding;
import io.github.seniorzhai.databindingdemo.model.ObservableUser;
import io.github.seniorzhai.databindingdemo.model.PlainUser;


/**
 * Created by zhaitao on 15/8/14.
 */
public class ObservaleActivity extends AppCompatActivity {
    ObservableUser user = new ObservableUser();
    PlainUser plain = new PlainUser();
    ObservableArrayMap<String, Object> map = new ObservableArrayMap<>();
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityObservaleBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_observale);
        binding.setUser(user);
        binding.setPlain(plain);
    }

    public void click(View v) {
        i++;
        user.setName(String.format("My name is zhai No.%d", i));
        plain.name.set(String.format("My name is Tao No. %d", i));
        plain.age.set(i);
    }

    public static void start(Context context) {
        Intent intent = new Intent(context, ObservaleActivity.class);
        context.startActivity(intent);
    }

}
