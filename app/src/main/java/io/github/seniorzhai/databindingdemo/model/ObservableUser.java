package io.github.seniorzhai.databindingdemo.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import io.github.seniorzhai.databindingdemo.BR;

/**
 * Created by zhaitao on 15/8/14.
 */
public class ObservableUser extends BaseObservable {
    public String name;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

}
