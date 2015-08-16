package io.github.seniorzhai.databindingdemo.model;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by zhaitao on 15/8/15.
 */
public class PlainUser {
    public ObservableField<String> name;
    public ObservableInt age;
    public PlainUser(){
        name = new ObservableField<>();
        age = new ObservableInt();
    }
}
