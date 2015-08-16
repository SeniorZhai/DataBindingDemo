package io.github.seniorzhai.databindingdemo;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.seniorzhai.databindingdemo.databinding.ItemGridBinding;
import io.github.seniorzhai.databindingdemo.model.PlainUser;

/**
 * Created by zhaitao on 15/8/16.
 */
public class BingdingFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ItemGridBinding binding = DataBindingUtil.inflate(inflater, R.layout.item_grid, container, false);
        PlainUser user = new PlainUser();
        user.name.set("SBBBBBBBB");
        user.age.set(111);
        binding.setUser(user);
        binding.getRoot().setBackgroundColor(RandomColor.getColor());
        return binding.getRoot();
    }
}
